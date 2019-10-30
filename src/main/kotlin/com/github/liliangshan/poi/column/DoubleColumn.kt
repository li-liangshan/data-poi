package com.github.liliangshan.poi.column


/************************************
 * DoubleColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class DoubleColumn(index: Int, key: String, value: Double) : AbstractColumn<Double>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.DOUBLE
    }

}