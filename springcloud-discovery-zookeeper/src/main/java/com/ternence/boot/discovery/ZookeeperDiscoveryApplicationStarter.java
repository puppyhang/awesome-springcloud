package com.ternence.boot.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用Zookeeper作为服务注册组件应用启动的starter
 * <p>
 * <code>@EnableDiscoveryClient</code>将会让节点将自己的信息注册到服务发现组件
 * <p>
 * 这里是zookeeper,zookeeper的任何状态都会被这个服务watch,一旦发生变化,这里就会立刻受到通知
 * <p>
 * 如果zookeeper的链接断开,则服务会一直不断的尝试重新链接zookeeper,直到连接上为止
 *
 * @author Ternence
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperDiscoveryApplicationStarter {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        SpringApplication application = builder
                .sources(ZookeeperDiscoveryApplicationStarter.class)
                .main(ZookeeperDiscoveryApplicationStarter.class)
                .build();
        application.run(args);
    }

}
