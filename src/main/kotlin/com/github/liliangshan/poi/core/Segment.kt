package com.github.liliangshan.poi.core

import com.github.liliangshan.poi.column.Column

/************************************
 * Segment class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
interface Segment : Iterable<Column<*>>, Comparable<Segment> {

    fun addColumn(column: Column<*>)

    fun setColumn(index: Int, column: Column<*>)

    fun getColumn(index: Int): Column<*>

    fun getColumns(): List<Column<*>>

    fun id(): Long

    fun isHead(): Boolean

    fun isEmpty(): Boolean

    fun isNotEmpty(): Boolean

}