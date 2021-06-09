package com.store.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:40:32
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

