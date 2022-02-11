package com.zhenuy.maven.dao.po;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Date 2020/11/12 18:00
 * @Author gongzhenyu
 */
@Data
@Document(collection="mongopo")
public class MongoPo {
    private Integer id;
    private Integer age;
    private String name;
}
