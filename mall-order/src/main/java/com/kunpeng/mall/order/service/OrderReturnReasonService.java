package com.kunpeng.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kunpeng.common.utils.PageUtils;
import com.kunpeng.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:31:22
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

