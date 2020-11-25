package com.sinosdx.maven.service;

import com.sinosdx.maven.dao.po.PrinterConfigPo;
import com.sinosdx.maven.mybatis.mapper.PrinterConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date 2020/11/2 14:55
 * @Author gongzhenyu
 */
@Service
public class MavenDemoService {

    @Autowired
    private PrinterConfigMapper printerConfigMapper;


    public List<PrinterConfigPo> queryPrinterStatus(String status){
        List<PrinterConfigPo> printerConfigPos = printerConfigMapper.queryPrinterStatus(status);
        return printerConfigPos;
    }
}
