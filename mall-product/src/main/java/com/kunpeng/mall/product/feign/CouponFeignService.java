package com.kunpeng.mall.product.feign;

import com.kunpeng.common.to.SkuReductionTo;
import com.kunpeng.common.to.SpuBoundTo;
import com.kunpeng.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("mall-coupon")
public interface CouponFeignService {

	@PostMapping("/coupon/spubounds/save")
	R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

	@PostMapping("/coupon/skufullreduction/saveinfo")
	R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
