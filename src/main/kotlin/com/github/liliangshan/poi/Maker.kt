package com.github.liliangshan.poi

import com.github.liliangshan.poi.model.BookSheet

/************************************
 * Maker interface
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
interface Maker<T> {

    fun createWorkBook(name: String): Maker<T>

    fun createBookSheets(bookSheets: List<BookSheet>): Maker<T>

    fun createBookSheet(bookSheet: BookSheet): Maker<T>

    fun createSheet(name: String, segments: List<Segment>): Maker<T>

    fun createSheet(name: String, position: Int, segments: List<Segment>): Maker<T>

    fun build(): T

}