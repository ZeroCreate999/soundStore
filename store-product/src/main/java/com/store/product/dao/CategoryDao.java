package com.store.product.dao;

import com.store.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-08 20:20:59
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
