package com.github.liliangshan.poi

/************************************
 * NoSuchFieldTypeException class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class NoSuchFieldTypeException(message: String?, cause: Throwable?,
                               val code: String = "POI_EXCEPTION") : RuntimeException(message, cause)
