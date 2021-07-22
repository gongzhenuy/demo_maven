package com.sinosdx.maven.dao.mapper;

import com.sinosdx.maven.dao.entity.MenuInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 菜单表(MenuInfo)
 *
 * @Author gongzhenyu
 * @Date 2021-03-04 15:28:23
 */
@Mapper
public interface MenuInfoMapper {

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
     * @Describe 查询指定行数据
     */
    List<MenuInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * @param menuInfo 实例对象
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 通过实体作为筛选条件查询
     */
    List<MenuInfo> queryAll(MenuInfo menuInfo);

    /**
     * @param menuInfo 实例对象
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 新增数据
     */
    int insert(MenuInfo menuInfo);

    /**
     * @param entities List<MenuInfo> 实例对象列表
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 批量新增数据（MyBatis原生foreach方法）
     */
    int insertBatch(@Param("entities") List<MenuInfo> entities);

    /**
     * @param entities List<MenuInfo> 实例对象列表
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 批量新增或按主键更新数据
     */
    int insertOrUpdateBatch(@Param("entities") List<MenuInfo> entities);

    /**
     * @param menuInfo 实例对象
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 修改数据
     */
    int update(MenuInfo menuInfo);

    /**
     * @param id 主键
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 通过主键删除数据
     */
    int deleteById(Integer id);

}

