package com.kunpeng.mall.ware.vo;

import lombok.Data;
import org.apache.catalina.LifecycleState;

import java.util.List;

@Data
public class MergeVo {
	private Long purchaseId;
	private List<Long> items;
}
