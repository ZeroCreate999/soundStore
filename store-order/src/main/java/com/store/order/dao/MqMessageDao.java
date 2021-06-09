package com.store.order.dao;

import com.store.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:32:17
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
