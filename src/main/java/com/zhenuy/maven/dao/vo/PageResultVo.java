package com.zhenuy.maven.dao.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


/**
 * @Author gongzhenyu
 * @Date 2021/9/13 11:23
 * @Describe 分页实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResultVo<T> implements Serializable {
    private static final long serialVersionUID = -1L;
    /**
     * 总数
     */
    private Long count;
    /**
     * 当前页结果集
     */
    private List<T> data;

}
