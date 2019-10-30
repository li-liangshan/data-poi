package com.github.liliangshan.poi.column

/************************************
 * LongColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class LongColumn(index: Int, key: String, value: Long) : AbstractColumn<Long>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.LONG
    }

}