package com.github.liliangshan.poi.column

import com.github.liliangshan.poi.core.NoSuchFieldTypeException
import java.math.BigDecimal
import java.util.*

/************************************
 * LongColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class LongColumn(index: Int, key: String, value: Long) : AbstractColumn<Long>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.LONG
    }

    override fun toLong(): Long {
        return this.value()
    }

    override fun toInt(): Int {
        return this.value().toInt()
    }

    override fun toBoolean(): Boolean {
        return this.value() != 0L
    }

    override fun toFloat(): Float {
        return this.value().toFloat()
    }

    override fun toDouble(): Double {
        return this.value().toDouble()
    }

    override fun toText(): String {
        return this.value().toString()
    }

    override fun toDate(): Date {
        return Date(this.value())
    }

    override fun toDecimal(): BigDecimal {
        return this.value().toBigDecimal()
    }

}