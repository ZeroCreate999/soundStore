package com.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-08 20:20:59
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

