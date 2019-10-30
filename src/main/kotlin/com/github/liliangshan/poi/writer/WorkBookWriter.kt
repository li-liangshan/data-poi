package com.github.liliangshan.poi.writer

import com.github.liliangshan.poi.Maker
import org.apache.poi.ss.usermodel.Workbook
import java.io.OutputStream

/************************************
 * WorkBookWriter class
 * @author liliangshan
 * @date 2019/10/30
 ************************************/
class WorkBookWriter(outputStream: OutputStream, maker: Maker<Workbook>) : BookWriter<Workbook>(outputStream, maker) {

    override fun write(outputStream: OutputStream, o: Workbook) {
        o.write(outputStream)
    }

}