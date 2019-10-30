package com.github.liliangshan.poi.column

/************************************
 * BooleanColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class BooleanColumn(index: Int, key: String, value: Boolean) : AbstractColumn<Boolean>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.BOOLEAN
    }

}