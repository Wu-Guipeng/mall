package com.kunpeng.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kunpeng.common.utils.PageUtils;
import com.kunpeng.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:27:45
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

