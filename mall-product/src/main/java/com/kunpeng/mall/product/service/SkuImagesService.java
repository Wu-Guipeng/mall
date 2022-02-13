package com.kunpeng.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kunpeng.common.utils.PageUtils;
import com.kunpeng.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wuguipeng
 * @email wuguipeng@gmail.com
 * @date 2022-02-12 21:34:56
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

