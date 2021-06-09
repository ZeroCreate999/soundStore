package com.store.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:32:17
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

