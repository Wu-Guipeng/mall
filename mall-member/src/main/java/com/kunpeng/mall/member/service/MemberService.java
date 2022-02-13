package com.kunpeng.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kunpeng.common.utils.PageUtils;
import com.kunpeng.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:27:45
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

