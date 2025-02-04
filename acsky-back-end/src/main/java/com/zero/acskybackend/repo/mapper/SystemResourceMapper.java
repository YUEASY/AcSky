package com.zero.acskybackend.repo.mapper;

import com.zero.acskybackend.model.po.SystemResource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * SystemResourceMapper
 *
 * @author ZERO
 * @date 2023/6/15
 */
@Mapper
public interface SystemResourceMapper {

    /**
     * 获取系统资源列表
     * @return List<SystemResource>
     */
    List<SystemResource> querySystemResourceList();

}
