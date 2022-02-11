package com.sinosdx.maven.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sinosdx.maven.dao.po.HandleLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (HandleLog)
 *
 * @Author gongzhenyu
 * @Date 2021-05-13 17:56:27
 * @Describe 对应HandleLogMapper.xml中方法
 */
@Repository
public interface HandleLogMapper extends BaseMapper<HandleLog> {

    /**
     * @param id 主键
     * @return 实例对象
     * @Author gongzhenyu
     * @Describe 通过ID查询单条数据
     */
    HandleLog queryById(Integer id);

    /**
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 查询指定行数据
     */
    List<HandleLog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * @param handleLog 实例对象
     * @return 对象列表
     * @Author gongzhenyu
     * @Describe 通过实体作为筛选条件查询
     */
    List<HandleLog> queryAll(HandleLog handleLog);

    /**
     * @param handleLog 实例对象
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 新增数据
     */
    int insert(HandleLog handleLog);

    /**
     * @param entities List<HandleLog> 实例对象列表
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 批量新增数据（MyBatis原生foreach方法）
     */
    int insertBatch(@Param("entities") List<HandleLog> entities);

    /**
     * @param entities List<HandleLog> 实例对象列表
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 批量新增或按主键更新数据
     */
    int insertOrUpdateBatch(@Param("entities") List<HandleLog> entities);

    /**
     * @param handleLog 实例对象
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 修改数据
     */
    int update(HandleLog handleLog);

    /**
     * @param id 主键
     * @return 影响行数
     * @Author gongzhenyu
     * @Describe 通过主键删除数据
     */
    int deleteById(Integer id);

}

