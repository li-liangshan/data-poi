package com.github.liliangshan.poi

import com.github.liliangshan.poi.column.IntColumn
import com.github.liliangshan.poi.column.StringColumn
import com.github.liliangshan.poi.config.BookConfig
import com.github.liliangshan.poi.core.Record
import com.github.liliangshan.poi.maker.BookMaker
import com.github.liliangshan.poi.model.Book
import com.github.liliangshan.poi.model.BookSheet
import com.github.liliangshan.poi.writer.WorkBookWriter
import java.io.File
import java.io.FileOutputStream

/************************************
 * Application class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class Application

fun main(args: Array<String>) {
    val path = System.getProperty("user.dir")
    val outputStream = FileOutputStream(File("$path/file.xls"))

    val bookConfig = BookConfig(
            name = "员工表",
            category = "员工信息",
            manager = "江南一点雨",
            company = "XXX集团",
            subject = "员工信息表",
            title = "员工信息",
            author = "liliangshan",
            comments = "备注信息暂无"
    )

    val writer = WorkBookWriter(outputStream, BookMaker(bookConfig))

    val head = Record(
            id = 0,
            head = true,
            columns = mutableListOf(
                    StringColumn(index = 0, key = "0", value = "姓名"),
                    StringColumn(index = 1, key = "1", value = "年龄"),
                    StringColumn(index = 2, key = "2", value = "居住城市"),
                    StringColumn(index = 3, key = "3", value = "职业")
            )
    )

    val row001 = Record(
            id = 1,
            columns = mutableListOf(
                    StringColumn(index = 0, key = "0", value = "小明"),
                    IntColumn(index = 1, key = "1", value = 18),
                    StringColumn(index = 2, key = "2", value = "广州"),
                    StringColumn(index = 3, key = "3", value = "在校大学生")
            )
    )

    val row002 = Record(
            id = 2,
            columns = mutableListOf(
                    StringColumn(index = 0, key = "0", value = "小花"),
                    IntColumn(index = 1, key = "1", value = 30),
                    StringColumn(index = 2, key = "2", value = "上海"),
                    StringColumn(index = 3, key = "3", value = "程序员")
            )
    )

    val row003 = Record(
            id = 3,
            columns = mutableListOf(
                    StringColumn(index = 0, key = "0", value = "小王"),
                    IntColumn(index = 1, key = "1", value = 25),
                    StringColumn(index = 2, key = "2", value = "上海"),
                    StringColumn(index = 3, key = "3", value = "建筑工程师")
            )
    )

    val bookSheets = mutableListOf(
            BookSheet(name = "员工表Sheet001", position = 0, rows = mutableListOf(head, row001, row002, row003)),
            BookSheet(name = "员工表Sheet002", position = 1, rows = mutableListOf(head, row001, row002, row003)),
            BookSheet(name = "员工表Sheet003", position = 2, rows = mutableListOf(head, row001, row002, row003)),
            BookSheet(name = "员工表Sheet004", position = 5, rows = mutableListOf(head, row001, row002, row003)),
            BookSheet(name = "员工表Sheet005", position = 3, rows = mutableListOf(head, row001, row002, row003)),
            BookSheet(name = "员工表Sheet006", position = 4, rows = mutableListOf(head, row001, row002, row003))
    )

    val book = Book(name = "员工表", bookSheets = bookSheets)

    writer.write(book)

}