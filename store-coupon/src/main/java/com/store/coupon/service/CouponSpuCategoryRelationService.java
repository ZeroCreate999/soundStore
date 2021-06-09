package com.store.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-08 14:04:54
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

