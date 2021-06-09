package com.store.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:40:32
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

