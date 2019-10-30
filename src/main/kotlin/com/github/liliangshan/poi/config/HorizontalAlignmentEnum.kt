package com.github.liliangshan.poi.config

import org.apache.poi.ss.usermodel.HorizontalAlignment

/************************************
 * HorizontalAlignment enum
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
enum class HorizontalAlignmentEnum {
    GENERAL,
    LEFT,
    CENTER,
    RIGHT,
    FILL,
    JUSTIFY,
    CENTER_SELECTION,
    DISTRIBUTED;

    fun toHorizontalAlignment(): HorizontalAlignment {
        return when (this) {
            GENERAL -> HorizontalAlignment.GENERAL
            LEFT -> HorizontalAlignment.LEFT
            CENTER -> HorizontalAlignment.CENTER
            RIGHT -> HorizontalAlignment.RIGHT
            FILL -> HorizontalAlignment.FILL
            JUSTIFY -> HorizontalAlignment.JUSTIFY
            CENTER_SELECTION -> HorizontalAlignment.CENTER_SELECTION
            DISTRIBUTED -> HorizontalAlignment.DISTRIBUTED
        }
    }
}
