package com.store.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.store.common.utils.PageUtils;
import com.store.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author fany
 * @email 604540705@qq.com
 * @date 2021-06-09 09:26:58
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

