package com.kunpeng.mall.product.dao;

import com.kunpeng.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 21:34:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
