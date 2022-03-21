package com.kunpeng.mall.ware.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class PurchaseItemsDoneVo {
	@NotNull
	private Long itemId;
	private Integer status;
	private String reason;
}
