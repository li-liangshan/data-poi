package com.github.liliangshan.poi.writer

import java.io.IOException

/************************************
 * Writer interface
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
interface Writer<T> {

    @Throws(IOException::class)
    fun write(data: T)

    @Throws(IOException::class)
    fun flush()

    fun available(): Boolean

    @Throws(IOException::class)
    fun close()

}