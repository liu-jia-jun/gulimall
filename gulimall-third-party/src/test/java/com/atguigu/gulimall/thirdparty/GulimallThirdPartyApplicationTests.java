package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.*;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {




    @Test
    public void contextLoads() throws FileNotFoundException {
        String endpoint = "oss-cn-hangzhou.aliyuncs.com";
        String accessKeyId = "LTAI5tH7icmX7TDMXZTrskHb";
        String accessKeySecret = "gR1nd8ES2gBeTuH70t2G1Z3usUWL9T";

        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        FileInputStream inputStream = new FileInputStream("E:\\data\\手机文件\\图片\\02.jpg");

        ossClient.putObject("gulimall12138","02.jpg",inputStream);
        ossClient.shutdown();
        System.out.println("finish");

    }

}
