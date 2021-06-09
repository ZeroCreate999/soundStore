package com.store.ware.dao;

import com.store.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:40:31
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
