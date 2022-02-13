package com.kunpeng.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kunpeng.common.utils.PageUtils;
import com.kunpeng.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:31:23
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

