package com.ternence.boot.discovery.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 使用Eureka作为服务注册和发现组件
 *
 * @author Ternence
 * @version 1.0
 */
@SuppressWarnings("SpringFacetCodeInspection")
@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryApplicationStarter {

    public static void main(String[] args) {

        new SpringApplicationBuilder(EurekaDiscoveryApplicationStarter.class)
                .web(true).run(args);
    }
}
