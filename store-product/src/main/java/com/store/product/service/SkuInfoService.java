package com.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-08 20:20:58
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

