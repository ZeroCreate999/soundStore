package com.store.coupon.dao;

import com.store.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-08 14:04:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
