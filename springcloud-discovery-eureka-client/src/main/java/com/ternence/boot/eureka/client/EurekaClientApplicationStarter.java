package com.ternence.boot.eureka.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka客户端启动器
 *
 * @author Ternence
 * @version 1.0
 */
@SuppressWarnings("SpringFacetCodeInspection")
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplicationStarter {

    public static void main(String[] args) {

        new SpringApplicationBuilder(EurekaClientApplicationStarter.class)
                .web(true)
                .run(args);
    }
}
