package com.github.liliangshan.poi.column

/************************************
 * IntColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class IntColumn(index: Int, key: String, value: Int) : AbstractColumn<Int>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.INT
    }

}