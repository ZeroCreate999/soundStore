package com.store.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-08 20:20:57
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

