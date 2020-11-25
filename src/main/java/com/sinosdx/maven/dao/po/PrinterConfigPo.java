package com.sinosdx.maven.dao.po;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Date 2020/9/25 15:00
 * @Author gongzhenyu
 */
@Table(name = "t_printer_config")
@Data
public class PrinterConfigPo {

    @Id
    private Integer id;
    private String name;//名称
    private String floor;//楼层
    private String serial;//型号
    private String status;//状态
    private String url;
    //附加字段
    private Date createTime;
    private Date updateTime;
    private Integer disorder;

}
