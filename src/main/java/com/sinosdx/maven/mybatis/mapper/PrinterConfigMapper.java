package com.sinosdx.maven.mybatis.mapper;

import com.sinosdx.maven.dao.po.PrinterConfigPo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Date 2020/9/25 15:00
 * @Author gongzhenyu
 */
@Resource
public interface PrinterConfigMapper extends Mapper<PrinterConfigPo> {


    @Select("select * from t_printer_config where status=#{status} order by CONVERT(SUBSTR(floor,1, CHAR_LENGTH(floor)-1),UNSIGNED INTEGER)")
    List<PrinterConfigPo> queryPrinterStatus(@Param("status") String status);

    

}
