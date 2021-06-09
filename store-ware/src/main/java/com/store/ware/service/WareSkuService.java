package com.store.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:40:31
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

