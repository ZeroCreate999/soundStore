package com.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-08 20:20:59
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

