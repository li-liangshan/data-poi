package com.github.liliangshan.poi.column

import java.math.BigDecimal

/************************************
 * DecimalColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class DecimalColumn(index: Int, key: String, value: BigDecimal) : AbstractColumn<BigDecimal>(index = index, key = key, value = value) {

    override fun type(): FieldType {
        return FieldType.DECIMAL
    }

}