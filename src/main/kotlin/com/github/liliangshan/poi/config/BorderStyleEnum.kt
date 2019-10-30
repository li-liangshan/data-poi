package com.github.liliangshan.poi.config

import org.apache.poi.ss.usermodel.BorderStyle

/************************************
 * BorderStyle enum
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
enum class BorderStyleEnum(val code: Int) {
    NONE(0),
    THIN(1),
    MEDIUM(2),
    DASHED(3),
    DOTTED(4),
    THICK(5),
    DOUBLE(6),
    HAIR(7),
    MEDIUM_DASHED(8),
    DASH_DOT(9),
    MEDIUM_DASH_DOT(10),
    DASH_DOT_DOT(11),
    MEDIUM_DASH_DOT_DOT(12),
    SLANTED_DASH_DOT(13);

    fun toBorderStyle(): BorderStyle {
        return when (this) {
            NONE -> BorderStyle.NONE
            THIN -> BorderStyle.THIN
            MEDIUM -> BorderStyle.MEDIUM
            DASHED -> BorderStyle.DASHED
            DOTTED -> BorderStyle.DOTTED
            THICK -> BorderStyle.THICK
            DOUBLE -> BorderStyle.DOUBLE
            HAIR -> BorderStyle.HAIR
            MEDIUM_DASHED -> BorderStyle.MEDIUM_DASHED
            DASH_DOT -> BorderStyle.DASH_DOT
            MEDIUM_DASH_DOT -> BorderStyle.MEDIUM_DASH_DOT
            DASH_DOT_DOT -> BorderStyle.DASH_DOT_DOT
            MEDIUM_DASH_DOT_DOT -> BorderStyle.MEDIUM_DASH_DOT_DOT
            SLANTED_DASH_DOT -> BorderStyle.SLANTED_DASH_DOT
        }
    }
}