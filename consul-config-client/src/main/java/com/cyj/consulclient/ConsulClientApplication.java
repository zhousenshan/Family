package com.cyj.consulclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ChenYongJia
 * @Description: ConsulClientApplication
 * @ClassName: SpringCloudApplication.java
 * @Date 2019年12月29日 晚上22：54
 * @Email chen87647213@163.com
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulClientApplication {

    public static void main(String[] args) {
        log.info("启动 consul-config-client 项目...");
        SpringApplication.run(ConsulClientApplication.class, args);
        log.info("启动 consul-config-client 项目成功...");
    }

}
