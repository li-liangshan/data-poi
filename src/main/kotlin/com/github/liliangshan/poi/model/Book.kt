package com.github.liliangshan.poi.model

/************************************
 * Book class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class Book(val name: String, var bookSheets: MutableList<BookSheet> = mutableListOf()) {

    fun addBookSheet(bookSheet: BookSheet) {
        bookSheets.add(bookSheet.position, bookSheet)
    }

    fun getBookSheet(position: Int): BookSheet? {
        return bookSheets[position]
    }

    fun getBookSheets(name: String): List<BookSheet> {
        return bookSheets.filter { it.name == name }
    }
}