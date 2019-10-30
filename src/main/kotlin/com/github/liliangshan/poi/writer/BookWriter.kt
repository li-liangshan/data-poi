package com.github.liliangshan.poi.writer

import com.github.liliangshan.poi.core.Maker
import com.github.liliangshan.poi.model.Book
import java.io.IOException
import java.io.OutputStream
import java.util.concurrent.atomic.AtomicBoolean

/************************************
 * BookWriter class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
abstract class BookWriter<T>(private val outputStream: OutputStream, private val maker: Maker<T>) : Writer<Book> {

    private val closed = AtomicBoolean(false)

    override fun write(data: Book) {
        if (closed.get()) {
            throw IOException("writer has closed.")
        }
        maker.createWorkBook(data.name)
        maker.createBookSheets(data.bookSheets)
        this.write(outputStream, maker.build())
        this.flush()
    }

    @Throws(IOException::class)
    protected abstract fun write(outputStream: OutputStream, o: T)

    override fun flush() {
        if (closed.get()) {
            return
        }
        outputStream.flush()
    }

    override fun available(): Boolean {
        return closed.get().not()
    }

    override fun close() {
        if (closed.get()) {
            return
        }
        outputStream.close()
        closed.set(true)
    }


}