package com.github.liliangshan.poi.column

/************************************
 * Column interface
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
interface Column<T> {

    fun type(): FieldType

    fun value(): T

    fun isNull(): Boolean

    fun key(): String

    fun index(): Int

}