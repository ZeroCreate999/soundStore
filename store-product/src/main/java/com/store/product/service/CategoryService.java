package com.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-08 20:20:59
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

