package com.kunpeng.mallthirdpart;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
public class TestDemo {
    @Autowired
    private OSS ossClient;

    @Test
    public void test(){
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
