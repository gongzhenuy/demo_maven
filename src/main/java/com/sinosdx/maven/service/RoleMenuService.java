package com.sinosdx.maven.service;

import com.sinosdx.maven.dao.entity.RoleMenu;

import java.util.List;

/**
 * 角色菜单表(RoleMenu)
 *
 * @Author gongzhenyu
 * @Date 2021-03-04 13:43:14
 */
public interface RoleMenuService {

    /**
     * @param id 主键
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 通过ID查询单条数据
     */
    RoleMenu queryById(Long id);

    /**
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 查询多条数据
     */
    List<RoleMenu> queryAllByLimit(int offset, int limit);

    /**
     * @param roleMenu 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 新增数据
     */
    RoleMenu insert(RoleMenu roleMenu);

    /**
     * @param roleMenu 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 修改数据
     */
    RoleMenu update(RoleMenu roleMenu);

    /**
     * @param id 主键
     * @return 是否成功
     * @Author gongzhenyu
     * @Describe 通过主键删除数据
     */
    boolean deleteById(Long id);

}
