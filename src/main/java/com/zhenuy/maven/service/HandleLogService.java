package com.zhenuy.maven.service;

import com.zhenuy.maven.dao.from.HandleLogFrom;
import com.zhenuy.maven.dao.po.HandleLog;

import java.util.List;

/**
 * (HandleLog)
 *
 * @Author gongzhenyu
 * @Date 2021-05-13 17:56:27
 */
public interface HandleLogService {

    /**
     * @param id 主键
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 通过ID查询单条数据
     */
    HandleLog queryById(Integer id);

    Object selectList(HandleLogFrom handleLogFrom);

    /**
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 查询多条数据
     */
    List<HandleLog> queryAllByLimit(int offset, int limit);

    /**
     * @param handleLog 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 新增数据
     */
    HandleLog insert(HandleLog handleLog);

    /**
     * @param handleLog 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 修改数据
     */
    HandleLog update(HandleLog handleLog);

    /**
     * @param id 主键
     * @return 是否成功
     * @Author gongzhenyu
     * @Describe 通过主键删除数据
     */
    boolean deleteById(Integer id);

}
