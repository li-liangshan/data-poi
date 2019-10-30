package com.github.liliangshan.poi.column

/************************************
 * AbstractColumn class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
abstract class AbstractColumn<T>(private var key: String, private var index: Int, private var value: T?) : Column<T> {

    override fun isNull(): Boolean {
        return this.value() == null
    }

    override fun value(): T? {
        return this.value
    }

    override fun key(): String {
        return this.key
    }

    override fun index(): Int {
        return this.index
    }

}