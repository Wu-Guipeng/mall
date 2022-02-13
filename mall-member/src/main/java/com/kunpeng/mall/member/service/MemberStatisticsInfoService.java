package com.kunpeng.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kunpeng.common.utils.PageUtils;
import com.kunpeng.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:27:43
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

