package com.sinosdx.maven.service.impl;

import com.sinosdx.maven.dao.entity.MenuInfo;
import com.sinosdx.maven.dao.mapper.MenuInfoMapper;
import com.sinosdx.maven.service.MenuInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单表(MenuInfo)
 *
 * @Author gongzhenyu
 * @Date 2021-03-04 15:28:23
 */
@Service("menuInfoService")
public class MenuInfoServiceImpl implements MenuInfoService {
    @Resource
    private MenuInfoMapper menuInfoMapper;

    /**
     * @param id 主键
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 通过ID查询单条数据
     */
    @Override
    public MenuInfo queryById(Integer id) {
        return this.menuInfoMapper.queryById(id);
    }

    /**
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 查询多条数据
     */
    @Override
    public List<MenuInfo> queryAllByLimit(int offset, int limit) {
        return this.menuInfoMapper.queryAllByLimit(offset, limit);
    }

    /**
     * @param menuInfo 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 新增数据
     */
    @Override
    public MenuInfo insert(MenuInfo menuInfo) {
        this.menuInfoMapper.insert(menuInfo);
        return menuInfo;
    }

    /**
     * @param menuInfo 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 修改数据
     */
    @Override
    public MenuInfo update(MenuInfo menuInfo) {
        this.menuInfoMapper.update(menuInfo);
        return this.queryById(menuInfo.getId());
    }

    /**
     * @param id 主键
     * @return 是否成功
     * @Author gongzhenyu
     * @Describe 通过主键删除数据
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.menuInfoMapper.deleteById(id) > 0;
    }
}
