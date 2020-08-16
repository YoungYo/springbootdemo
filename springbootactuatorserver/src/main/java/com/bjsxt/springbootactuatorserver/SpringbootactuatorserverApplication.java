package com.bjsxt.springbootactuatorserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author 王浩
 */
@SpringBootApplication
// 开启SpringBoot Admin 服务端
@EnableAdminServer
public class SpringbootactuatorserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootactuatorserverApplication.class, args);
    }

}
