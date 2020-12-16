package com.sinosdx.maven.controller;

import com.sinosdx.maven.dao.po.PrinterConfigPo;
import com.sinosdx.maven.dao.po.Product;
import com.sinosdx.maven.dao.vo.PrinterConfigVo;
import com.sinosdx.maven.service.MavenDemoService;
import com.sinosdx.maven.service.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Date 2020/11/2 14:32
 * @Author gongzhenyu
 */
@Controller
@RestController
public class DemoController {

    @Autowired
    private MavenDemoService mavenDemoService;

    @Autowired
    private RedisService redisService;

    /**
     * @Author gongzhenyu
     * @Date 2020/9/25 16:01
     * @Describe 获取打印机列表
     */
    @RequestMapping("/print/queryPrinterStatus")
    public Object queryPrinterStatus(@RequestBody PrinterConfigVo printerConfigVo){

        List<PrinterConfigPo> printerConfigPos = mavenDemoService.queryPrinterStatus(printerConfigVo.getStatus());
        //String ss = "添加成功";
        return new ResponseEntity<>(printerConfigPos, HttpStatus.OK);
    }

    /**
     * @Author gongzhenyu
     * @Description TODO 测试redis
     * @Date 2019/8/22 13:57
     * @Param
     */
    @RequestMapping("/print/getRedisList")
    public void getRedisList() {
        redisService.save("qwert2", "key2", 60);
        String key2 = redisService.read("key2");
        System.out.println(key2);
        PrinterConfigPo printerConfigPo=new PrinterConfigPo();
    }

    public static void main(String[] args) {
        Product product =Product.builder().id(2).name("").type(1).price(100f).build();
        System.out.println(product.toString());
        product=product.toBuilder().id(3).build();
        System.out.println(product.toString());
        product.setId(5);
        System.out.println(product.toString());
    }

}
