package com.github.liliangshan.poi.core

import com.github.liliangshan.poi.column.Column

/************************************
 * Record class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class Record(private val id: Long,
             private val head: Boolean = false,
             private val columns: MutableList<Column<*>> = mutableListOf()) : Segment {

    override fun addColumn(column: Column<*>) {
        this.columns.add(column)
    }

    override fun setColumn(index: Int, column: Column<*>) {
        this.columns.add(index, column)
    }

    override fun getColumn(index: Int): Column<*> {
        return this.columns[index]
    }

    override fun getColumns(): List<Column<*>> {
        return this.columns
    }

    override fun id(): Long {
        return this.id
    }

    override fun isHead(): Boolean {
        return this.head
    }

    override fun isEmpty(): Boolean {
        return this.columns.isEmpty()
    }

    override fun isNotEmpty(): Boolean {
        return this.columns.isNotEmpty()
    }

    override fun iterator(): Iterator<Column<*>> {
        return this.columns.iterator()
    }

    override fun compareTo(other: Segment): Int {
        return id.compareTo(other.id())
    }

}