package com.kunpeng.mall.product.controller;

import com.kunpeng.mall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class TestController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/test")
    public void test(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        System.out.println(Arrays.asList(catelogPath));
    }

}
