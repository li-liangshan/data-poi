package com.github.liliangshan.poi.column

/************************************
 * StringColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class StringColumn(index: Int, key: String, value: String) : AbstractColumn<String>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.STRING
    }

}