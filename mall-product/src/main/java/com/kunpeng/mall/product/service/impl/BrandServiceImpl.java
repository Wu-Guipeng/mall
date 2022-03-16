package com.kunpeng.mall.product.service.impl;

import com.kunpeng.mall.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kunpeng.common.utils.PageUtils;
import com.kunpeng.common.utils.Query;

import com.kunpeng.mall.product.dao.BrandDao;
import com.kunpeng.mall.product.entity.BrandEntity;
import com.kunpeng.mall.product.service.BrandService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @Autowired
    private CategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        String  key = (String)params.get("key");
        QueryWrapper<BrandEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("brand_id", key).or().like("name", key);

        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                wrapper

        );

        return new PageUtils(page);
    }

    @Transactional
    @Override
    public void updateByIdDetail(BrandEntity brand) {
        // 保证冗余字段的更新
        this.updateById(brand);
        if (!StringUtils.isEmpty(brand.getName())){
            categoryBrandRelationService.updateBrand(brand.getBrandId(), brand.getName());

        }

    }

}
