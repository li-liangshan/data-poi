package com.github.liliangshan.poi

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.CellStyle
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook
import com.github.liliangshan.poi.column.FieldType
import java.math.BigDecimal
import java.util.*
import org.apache.poi.ss.usermodel.IndexedColors
import com.github.liliangshan.poi.config.*
import com.github.liliangshan.poi.model.BookSheet

/************************************
 * BookMaker class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class BookMaker(private val bookConfig: BookConfig) : Maker<Workbook> {

    private var bookName: String = ""
    private val sheets = mutableMapOf<String, BookSheet>()

    private fun initialize(workbook: Workbook) {
        if (workbook is HSSFWorkbook) {
            workbook.createInformationProperties()
            workbook.documentSummaryInformation.category = bookConfig.category
            workbook.documentSummaryInformation.manager = bookConfig.manager
            workbook.documentSummaryInformation.company = bookConfig.company
            workbook.summaryInformation.applicationName = bookConfig.name
            workbook.summaryInformation.author = bookConfig.author
            workbook.summaryInformation.subject = bookConfig.subject
            workbook.summaryInformation.title = bookConfig.title
            workbook.summaryInformation.comments = bookConfig.comments
        }
    }

    private fun createWorkbook(): Workbook {
        val workbook = HSSFWorkbook()
        workbook.createInformationProperties()
        this.initialize(workbook)
        return workbook
    }

    override fun createWorkBook(name: String): Maker<Workbook> {
        this.bookName = name
        return this
    }

    override fun createBookSheets(bookSheets: List<BookSheet>): Maker<Workbook> {
        bookSheets.forEach { this.createBookSheet(it) }
        return this
    }

    override fun createBookSheet(bookSheet: BookSheet): Maker<Workbook> {
        this.createSheet(bookSheet.name, bookSheet.segments())
        return this
    }

    override fun createSheet(name: String, segments: List<Segment>): Maker<Workbook> {
        val exist = this.sheets[name]
        val position = exist?.position ?: sheets.size
        this.createSheet(name, position, segments)
        return this
    }

    override fun createSheet(name: String, position: Int, segments: List<Segment>): Maker<Workbook> {
        this.sheets[name] = BookSheet(name = name, position = position, rows = segments.toMutableList())
        return this
    }

    override fun build(): Workbook {
        val workbook = this.createWorkbook()
        val bookSheets = this.sheets.values
        bookSheets.sortedBy { it.position }
        bookSheets.forEach { this.buildSheet(workbook, it) }
        return workbook
    }

    private fun buildSheet(workbook: Workbook, bookSheet: BookSheet) {
        val sheet = workbook.createSheet()
        workbook.setSheetName(bookSheet.position, bookSheet.name)
        // 设置列头宽度
        bookSheet.segments().indices.forEach { sheet.setColumnWidth(it, 4000) }
        // 设置默认行高
        sheet.defaultRowHeight = 400.toShort()
        this.buildSheetRows(workbook, sheet, bookSheet.segments())
    }

    private fun buildSheetRows(workbook: Workbook, sheet: Sheet, segments: List<Segment>) {
        segments.forEach { this.buildSheetRow(workbook, sheet, it) }
    }

    private fun buildSheetRow(workbook: Workbook, sheet: Sheet, segment: Segment) {
        val row = sheet.createRow(segment.id().toInt())
        val columns = segment.getColumns()

        var cell: Cell
        columns.forEach {
            cell = row.createCell(it.index())
            when (it.type()) {
                FieldType.NULL -> cell.setCellValue("")
                FieldType.STRING -> cell.setCellValue(it.value() as String)
                FieldType.INT -> cell.setCellValue((it.value() as Int).toString())
                FieldType.LONG -> cell.setCellValue((it.value() as Long).toString())
                FieldType.FLOAT -> cell.setCellValue((it.value() as Float).toBigDecimal().toPlainString())
                FieldType.DOUBLE -> cell.setCellValue((it.value() as Double).toBigDecimal().toPlainString())
                FieldType.DECIMAL -> cell.setCellValue((it.value() as BigDecimal).toPlainString())
                FieldType.BOOLEAN -> cell.setCellValue(it.value() as Boolean)
                FieldType.DATE -> cell.setCellValue(it.value() as Date)
            }
            if (segment.isHead()) {
                cell.cellStyle = this.buildHeadCellStyle(workbook)
            }
        }
    }

    private fun buildHeadCellStyle(workbook: Workbook): CellStyle {
        val style = workbook.createCellStyle()
        //对齐方式设置
        style.alignment = HorizontalAlignmentEnum.CENTER.toHorizontalAlignment()
        //边框颜色和宽度设置
        style.borderBottom = BorderStyleEnum.THIN.toBorderStyle()
        style.bottomBorderColor = IndexedColors.BLACK.getIndex() // 下边框
        style.borderLeft = BorderStyleEnum.THIN.toBorderStyle()
        style.leftBorderColor = IndexedColors.BLACK.getIndex() // 左边框
        style.borderRight = BorderStyleEnum.THIN.toBorderStyle()
        style.rightBorderColor = IndexedColors.BLACK.getIndex() // 右边框
        style.borderTop = BorderStyleEnum.THIN.toBorderStyle()
        style.topBorderColor = IndexedColors.BLACK.getIndex() // 上边框
        //设置背景颜色
        style.fillForegroundColor = IndexedColors.GREY_25_PERCENT.getIndex()
        style.fillPattern = FillPatternEnum.SOLID_FOREGROUND.pattern
        //粗体字设置
        val font = workbook.createFont()
        font.bold = true
        style.setFont(font)
        return style
    }

}