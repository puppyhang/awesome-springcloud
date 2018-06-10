package com.ternence.boot.discovery.controller;

import com.ternence.boot.discovery.zookeeper.ZookeeperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * index controller
 *
 * @author Ternence
 * @version 1.0
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Resource
    private ZookeeperService zookeeperService;

    private final static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/node/{server}")
    public Object requestServiceConfig(@PathVariable("server") String server) {

        if ("myself".equals(server)) {

            String service = zookeeperService.getServiceAddress(ZookeeperService.Services.SPRING_CLOUD_DISCOVERY);

            LOGGER.info("请求服务{}信息{}", server, service);

            return service;
        }
        return null;

    }

}
