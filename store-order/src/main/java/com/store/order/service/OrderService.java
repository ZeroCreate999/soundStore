package com.store.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:32:17
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

