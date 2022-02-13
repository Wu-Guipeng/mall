package com.kunpeng.mall.order.dao;

import com.kunpeng.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:31:21
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
