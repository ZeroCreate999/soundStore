package com.store.order.dao;

import com.store.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:32:17
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
