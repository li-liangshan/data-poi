package com.github.liliangshan.poi.column

import com.github.liliangshan.poi.core.NoSuchFieldTypeException
import java.math.BigDecimal
import java.util.*

/************************************
 * DateColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class DateColumn(index: Int, key: String, value: Date) : AbstractColumn<Date>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.DATE
    }

    override fun toLong(): Long {
        return this.value().time
    }

    override fun toInt(): Int {
        return this.toLong().toInt()
    }

    override fun toBoolean(): Boolean {
        throw NoSuchFieldTypeException("不支持此类型")
    }

    override fun toFloat(): Float {
        return this.toLong().toFloat()
    }

    override fun toDouble(): Double {
        return this.toLong().toDouble()
    }

    override fun toText(): String {
        return this.value().toString()
    }

    override fun toDate(): Date {
        return this.value()
    }

    override fun toDecimal(): BigDecimal {
        return this.toLong().toBigDecimal()
    }

}