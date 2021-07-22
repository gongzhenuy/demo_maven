package com.sinosdx.maven.dao.mapper;

import com.sinosdx.maven.dao.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 角色菜单表(RoleMenu)
 *
 * @Author gongzhenyu
 * @Date 2021-03-04 13:43:14
 */
@Mapper
public interface RoleMenuMapper {

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
     * @Describe 查询指定行数据
     */
    @Select("select\n" +
            "          id, role_id, menu_id, status, creator, modifier, creator_date, update_date\n" +
            "        from conference_apply.role_menu\n" +
            "        limit #{offset}, #{limit}")
    List<RoleMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * @param roleMenu 实例对象
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 通过实体作为筛选条件查询
     */
    List<RoleMenu> queryAll(RoleMenu roleMenu);

    /**
     * @param roleMenu 实例对象
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 新增数据
     */
    int insert(RoleMenu roleMenu);

    /**
     * @param entities List<RoleMenu> 实例对象列表
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 批量新增数据（MyBatis原生foreach方法）
     */
    int insertBatch(@Param("entities") List<RoleMenu> entities);

    /**
     * @param entities List<RoleMenu> 实例对象列表
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 批量新增或按主键更新数据
     */
    int insertOrUpdateBatch(@Param("entities") List<RoleMenu> entities);

    /**
     * @param roleMenu 实例对象
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 修改数据
     */
    int update(RoleMenu roleMenu);

    /**
     * @param id 主键
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 通过主键删除数据
     */
    int deleteById(Long id);

}

