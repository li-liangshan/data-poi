package com.github.liliangshan.poi.config

import org.apache.poi.ss.usermodel.FillPatternType

/************************************
 * FillPattern enum
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
enum class FillPatternEnum(val code: Int, val pattern: FillPatternType) {
    /**
     * No background
     */
    NO_FILL(0, FillPatternType.NO_FILL),

    /**
     * Solidly filled
     */
    SOLID_FOREGROUND(1, FillPatternType.SOLID_FOREGROUND),

    /**
     * Small fine dots
     */
    FINE_DOTS(2, FillPatternType.FINE_DOTS),

    /**
     * Wide dots
     */
    ALT_BARS(3, FillPatternType.ALT_BARS),

    /**
     * Sparse dots
     */
    SPARSE_DOTS(4, FillPatternType.SPARSE_DOTS),

    /**
     * Thick horizontal bands
     */
    THICK_HORIZONTAL_BANDS(5, FillPatternType.THICK_HORZ_BANDS),

    /**
     * Thick vertical bands
     */
    THICK_VERT_BANDS(6, FillPatternType.THICK_VERT_BANDS),

    /**
     * Thick backward facing diagonals
     */
    THICK_BACKWARD_DIAG(7, FillPatternType.THICK_BACKWARD_DIAG),

    /**
     * Thick forward facing diagonals
     */
    THICK_FORWARD_DIAG(8, FillPatternType.THICK_FORWARD_DIAG),

    /**
     * Large spots
     */
    BIG_SPOTS(9, FillPatternType.BIG_SPOTS),

    /**
     * Brick-like layout
     */
    BRICKS(10, FillPatternType.BRICKS),

    /**
     * Thin horizontal bands
     */
    THIN_HORIZONTAL_BANDS(11, FillPatternType.THIN_HORZ_BANDS),

    /**
     * Thin vertical bands
     */
    THIN_VERT_BANDS(12, FillPatternType.THIN_VERT_BANDS),

    /**
     * Thin backward diagonal
     */
    THIN_BACKWARD_DIAG(13, FillPatternType.THIN_BACKWARD_DIAG),

    /**
     * Thin forward diagonal
     */
    THIN_FORWARD_DIAG(14, FillPatternType.THIN_FORWARD_DIAG),

    /**
     * Squares
     */
    SQUARES(15, FillPatternType.SQUARES),

    /**
     * Diamonds
     */
    DIAMONDS(16, FillPatternType.DIAMONDS),

    /**
     * Less Dots
     */
    LESS_DOTS(17, FillPatternType.LESS_DOTS),

    /**
     * Least Dots
     */
    LEAST_DOTS(18, FillPatternType.LEAST_DOTS);
}