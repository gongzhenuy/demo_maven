package com.sinosdx.maven.dao.po;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

/**
 * @Date 2020/11/13 11:30
 * @Author gongzhenyu
 */
@Data
@Document(collection="book")
public class Book {
    @Id
    private String id;
    private Integer price;
    private String name;
    private String info;
    private String publish;
    private Date createTime;
    private Date updateTime;
}
