package com.github.liliangshan.poi.column

import com.github.liliangshan.poi.core.NoSuchFieldTypeException
import java.math.BigDecimal
import java.util.*

/************************************
 * StringColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class StringColumn(index: Int, key: String, value: String) : AbstractColumn<String>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.STRING
    }

    override fun toLong(): Long {
        throw NoSuchFieldTypeException("不支持此类型")
    }

    override fun toInt(): Int {
        throw NoSuchFieldTypeException("不支持此类型")
    }

    override fun toBoolean(): Boolean {
        throw NoSuchFieldTypeException("不支持此类型")
    }

    override fun toFloat(): Float {
        throw NoSuchFieldTypeException("不支持此类型")
    }

    override fun toDouble(): Double {
        throw NoSuchFieldTypeException("不支持此类型")
    }

    override fun toText(): String {
        return this.value()
    }

    override fun toDate(): Date {
        throw NoSuchFieldTypeException("不支持此类型")
    }

    override fun toDecimal(): BigDecimal {
        throw NoSuchFieldTypeException("不支持此类型")
    }

}