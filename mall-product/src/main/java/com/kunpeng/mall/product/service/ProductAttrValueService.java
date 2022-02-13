package com.kunpeng.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kunpeng.common.utils.PageUtils;
import com.kunpeng.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 21:34:56
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

