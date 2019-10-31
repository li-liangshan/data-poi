package com.github.liliangshan.poi.column

import com.github.liliangshan.poi.core.NoSuchFieldTypeException
import java.math.BigDecimal
import java.util.*

/************************************
 * NullColumn class
 * @author liliangshan
 * @date 2019/10/31
 ************************************/
class NullColumn(key: String, index: Int, value: String = "") : AbstractColumn<String>(key, index, value) {

    override fun type(): FieldType {
        return FieldType.NULL
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