package com.store.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:32:17
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

