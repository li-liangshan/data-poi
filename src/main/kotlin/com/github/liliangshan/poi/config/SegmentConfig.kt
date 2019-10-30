package com.github.liliangshan.poi.config

/************************************
 * SegmentConfig class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class SegmentConfig(
        val id: Long,
        var columnConfigs: List<ColumnConfig> = emptyList()
)