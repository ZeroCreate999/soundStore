package com.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-08 20:20:58
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

