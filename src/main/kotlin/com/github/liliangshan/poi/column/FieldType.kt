package com.github.liliangshan.poi.column

/************************************
 * FieldType enum
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
enum class FieldType(val value: Int) {

    NULL(0),
    INT(1),
    LONG(2),
    FLOAT(3),
    DOUBLE(4),
    DECIMAL(5),
    STRING(6),
    BOOLEAN(7),
    DATE(8);

}