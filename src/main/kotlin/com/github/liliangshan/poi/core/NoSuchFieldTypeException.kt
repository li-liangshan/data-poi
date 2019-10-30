package com.github.liliangshan.poi.core

/************************************
 * NoSuchFieldTypeException class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class NoSuchFieldTypeException(message: String?, cause: Throwable? = null, val code: String = "POI_EXCEPTION")
    : RuntimeException(message, cause)
