package com.github.liliangshan.poi.column

import java.math.BigDecimal
import java.util.*

/************************************
 * AbstractColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
abstract class AbstractColumn<T>(private var key: String, private var index: Int, private var value: T) : Column<T> {

    override fun isNull(): Boolean {
        return this.value() == null
    }

    override fun value(): T {
        return this.value
    }

    override fun key(): String {
        return this.key
    }

    override fun index(): Int {
        return this.index
    }

    abstract fun toLong(): Long

    abstract fun toInt(): Int

    abstract fun toBoolean(): Boolean

    abstract fun toFloat(): Float

    abstract fun toDouble(): Double

    abstract fun toText(): String

    abstract fun toDate(): Date

    abstract fun toDecimal(): BigDecimal

}