package com.github.liliangshan.poi.column

import com.github.liliangshan.poi.core.NoSuchFieldTypeException
import java.math.BigDecimal
import java.util.*

/************************************
 * FloatColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class FloatColumn(index: Int, key: String, value: Float) : AbstractColumn<Float>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.FLOAT
    }

    override fun toLong(): Long {
        return this.value().toLong()
    }

    override fun toInt(): Int {
        return this.value().toInt()
    }

    override fun toBoolean(): Boolean {
        return this.value() != 0.0F
    }

    override fun toFloat(): Float {
        return this.value()
    }

    override fun toDouble(): Double {
        return this.value().toDouble()
    }

    override fun toText(): String {
        return this.value().toString()
    }

    override fun toDate(): Date {
        throw NoSuchFieldTypeException("不支持此类型")
    }

    override fun toDecimal(): BigDecimal {
        return this.value().toBigDecimal()
    }

}