package com.sinosdx.maven.service.impl;

import com.sinosdx.maven.dao.entity.RoleMenu;
import com.sinosdx.maven.dao.mapper.RoleMenuMapper;
import com.sinosdx.maven.service.RoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色菜单表(RoleMenu)
 *
 * @Author gongzhenyu
 * @Date 2021-03-04 14:01:32
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl implements RoleMenuService {
    @Resource
    private RoleMenuMapper roleMenuMapper;

    /**
     * @param id 主键
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 通过ID查询单条数据
     */
    @Override
    public RoleMenu queryById(Long id) {
        return this.roleMenuMapper.queryById(id);
    }

    /**
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 查询多条数据
     */
    @Override
    public List<RoleMenu> queryAllByLimit(int offset, int limit) {
        return this.roleMenuMapper.queryAllByLimit(offset, limit);
    }

    /**
     * @param roleMenu 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 新增数据
     */
    @Override
    public RoleMenu insert(RoleMenu roleMenu) {
        this.roleMenuMapper.insert(roleMenu);
        return roleMenu;
    }

    /**
     * @param roleMenu 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 修改数据
     */
    @Override
    public RoleMenu update(RoleMenu roleMenu) {
        this.roleMenuMapper.update(roleMenu);
        return this.queryById(roleMenu.getId());
    }

    /**
     * @param id 主键
     * @return 是否成功
     * @Author gongzhenyu
     * @Describe 通过主键删除数据
     */
    @Override
    public boolean deleteById(Long id) {
        return this.roleMenuMapper.deleteById(id) > 0;
    }
}
