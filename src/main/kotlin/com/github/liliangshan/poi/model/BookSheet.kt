package com.github.liliangshan.poi.model

import com.github.liliangshan.poi.Segment

/************************************
 * BookSheet class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class BookSheet(val name: String, val position: Int = 0, var rows: MutableList<Segment> = mutableListOf()) : Comparable<BookSheet> {

    fun segments(): List<Segment> {
        return rows.toList().sortedBy { it.id() }
    }

    override fun compareTo(other: BookSheet): Int {
        return position.compareTo(other.position)
    }

    fun addSegment(segment: Segment) {
        this.rows.add(segment)
    }

    fun addSegment(index: Int, segment: Segment) {
        this.rows.add(index, segment)
    }

    fun getSegment(index: Int): Segment? {
        return this.rows[index]
    }

    override fun equals(other: Any?): Boolean {
        if (other == null) {
            return false
        }
        if (other !is BookSheet) {
            return false
        }
        return other.name == name && other.position == position && rows.containsAll(other.rows) && other.rows.containsAll(rows)
    }

    override fun hashCode(): Int {
        return name.hashCode() xor position.hashCode()
    }

}