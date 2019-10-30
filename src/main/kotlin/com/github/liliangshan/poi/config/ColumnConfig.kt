package com.github.liliangshan.poi.config

/************************************
 * ColumnConfig class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class ColumnConfig(
        val segmentId: Long,
        val index: Long,
        val font: FontConfig? = null,
        val dataFormat: Short? = null,
        val hidden: Boolean? = null,
        val locked: Boolean? = null,
        val quotePrefix: Boolean? = null,
        val horizontalAlignment: HorizontalAlignmentEnum? = null,
        val wrapText: Boolean? = null,
        val verticalAlignment: VerticalAlignmentEnum? = null,
        val rotation: Short? = null,
        val indent: Short? = null,
        val leftBorder: BorderStyleEnum? = null,
        val rightBorder: BorderStyleEnum? = null,
        val topBorder: BorderStyleEnum? = null,
        val bottomBorder: BorderStyleEnum? = null,
        val leftBorderColor: Short? = null,
        val rightBorderColor: Short? = null,
        val topBorderColor: Short? = null,
        val bottomBorderColor: Short? = null,
        val fillPattern: FillPatternEnum? = null,
        val fillBackgroundColor: Short? = null,
        val fillForegroundColor: Short? = null,
        val shrinkToFit: Boolean? = null,
        val formula: String? = null
)



