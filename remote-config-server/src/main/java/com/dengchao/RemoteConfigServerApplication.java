package com.dengchao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author : dengchao
 * @description :
 * @create : 2020/7/12
 */
@EnableConfigServer
@SpringBootApplication
public class RemoteConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemoteConfigServerApplication.class, args);
    }
}
