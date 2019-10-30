package com.github.liliangshan.poi.column

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

}