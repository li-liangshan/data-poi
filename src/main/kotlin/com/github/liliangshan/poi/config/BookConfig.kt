package com.github.liliangshan.poi.config

/************************************
 * BookConfig class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class BookConfig(
        var name: String,
        var category: String,
        var manager: String,
        var company: String,
        var subject: String,
        var title: String,
        var author: String,
        var comments: String,
        var sheetConfigs: Map<Int, SheetConfig> = emptyMap()
)