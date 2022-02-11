package com.sinosdx.maven.dao.from;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @Date 2021/9/13 10:27
 * @Author gongzhenyu
 * @Describe
 */
@Data
public class BaseBean {

    @TableField(exist = false)
    private Integer page;
    @TableField(exist = false)
    private Integer limit;
}
