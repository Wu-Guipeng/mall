package com.kunpeng.mallthirdpart.controller;

import com.aliyun.oss.OSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RestController
public class TestController {

    @Autowired
    private OSS ossClient;

    @RequestMapping("/upload")
    public void upload(){
        String filePath= "C:\\Users\\KunPeng\\Pictures\\QQ截图20210814224419.png";
        try {
            InputStream inputStream = new FileInputStream(filePath);
            // 创建PutObject请求。
            ossClient.putObject("xyxdbp", "QQ截图20210814224419.png", inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
