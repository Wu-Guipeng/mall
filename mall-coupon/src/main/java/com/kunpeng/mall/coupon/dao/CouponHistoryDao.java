package com.kunpeng.mall.coupon.dao;

import com.kunpeng.mall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 22:19:54
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
