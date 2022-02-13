package com.kunpeng.mall.order.dao;

import com.kunpeng.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:31:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
