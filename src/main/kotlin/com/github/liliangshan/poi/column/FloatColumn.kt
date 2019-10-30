package com.github.liliangshan.poi.column

/************************************
 * FloatColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class FloatColumn(index: Int, key: String, value: Float) : AbstractColumn<Float>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.FLOAT
    }

}