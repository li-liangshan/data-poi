package com.github.liliangshan.poi.config

/************************************
 * SheetConfig class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class SheetConfig(
        var name: String,
        var position: Int = 0,
        var selected: Boolean = false,
        var hiddenColumns: List<Int> = emptyList(),
        var rightToLeft: Boolean = false,
        var widthColumns: Map<Int, Int> = emptyMap(),
        var defaultColumnWidth: Int = 0,
        var defaultRowHeight: Int = 0,
        var verticallyCenter: Boolean = false,
        var horizontallyCenter: Boolean = false,
        var removeMergedRegions: List<Int> = emptyList(),
        var forceFormulaRecalculation: Boolean? = null,
        var autoBreaks: Boolean? = null,
        var displayGuts: Boolean? = null,
        var displayZeros: Boolean? = null,
        var fitToPage: Boolean? = null,
        var printGridLines: Boolean? = null,
        var printRowAndColumnHeadings: Boolean? = null,
        var leftMargin: Double? = null,
        var rightMargin: Double? = null,
        var topMargin: Double? = null,
        var bottomMargin: Double? = null,
        var protectSheetPassword: String? = null,
        var zoom: Int? = null,
        var breakRowIndex: Int? = null,
        var breakColumnIndex: Int? = null,
        var autoSizeColumns: List<Int>? = null,
        var leftHeader: String? = null,
        var rightHeader: String? = null,
        var centerHeader: String? = null,
        var leftFooter: String? = null,
        var rightFooter: String? = null,
        var centerFooter: String? = null
)