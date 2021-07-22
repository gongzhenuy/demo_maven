package com.sinosdx.maven.service.impl;

import com.sinosdx.maven.dao.entity.HandleLog;
import com.sinosdx.maven.dao.mapper.HandleLogMapper;
import com.sinosdx.maven.service.HandleLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (HandleLog)
 *
 * @Author gongzhenyu
 * @Date 2021-05-13 17:56:27
 */
@Service("handleLogService")
public class HandleLogServiceImpl implements HandleLogService {
    @Resource
    private HandleLogMapper handleLogMapper;

    /**
     * @param id 主键
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 通过ID查询单条数据
     */
    @Override
    public HandleLog queryById(Integer id) {
        return this.handleLogMapper.queryById(id);
    }

    /**
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 查询多条数据
     */
    @Override
    public List<HandleLog> queryAllByLimit(int offset, int limit) {
        return this.handleLogMapper.queryAllByLimit(offset, limit);
    }

    /**
     * @param handleLog 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 新增数据
     */
    @Override
    public HandleLog insert(HandleLog handleLog) {
        this.handleLogMapper.insert(handleLog);
        return handleLog;
    }

    /**
     * @param handleLog 实例对象
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 修改数据
     */
    @Override
    public HandleLog update(HandleLog handleLog) {
        this.handleLogMapper.update(handleLog);
        return this.queryById(handleLog.getId());
    }

    /**
     * @param id 主键
     * @return 是否成功
     * @Author gongzhenyu
     * @Describe 通过主键删除数据
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.handleLogMapper.deleteById(id) > 0;
    }
}
