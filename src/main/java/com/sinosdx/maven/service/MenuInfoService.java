package com.sinosdx.maven.service;

import com.sinosdx.maven.dao.entity.MenuInfo;

import java.util.List;

/**
 * 菜单表(MenuInfo)
 *
 * @Author gongzhenyu
 * @Date 2021-03-04 15:28:23
 */
public interface MenuInfoService {

    /**
     * @param id 主键
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 通过ID查询单条数据
     */
    MenuInfo queryById(Integer id);

    /**
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 查询多条数据
     */
    List<MenuInfo> queryAllByLimit(int offset, int limit);

    /**
     * @param menuInfo 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 新增数据
     */
    MenuInfo insert(MenuInfo menuInfo);

    /**
     * @param menuInfo 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 修改数据
     */
    MenuInfo update(MenuInfo menuInfo);

    /**
     * @param id 主键
     * @return 是否成功
     * @Author gongzhenyu
     * @Describe 通过主键删除数据
     */
    boolean deleteById(Integer id);

}
