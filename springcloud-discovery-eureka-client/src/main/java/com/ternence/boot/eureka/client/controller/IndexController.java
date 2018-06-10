package com.ternence.boot.eureka.client.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * index controller
 *
 * @author Ternence
 * @version 1.0
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    private final static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
    @Resource
    private DiscoveryClient discoveryClient;


    @RequestMapping(path = "/services", produces = "application/json;charset=utf-8")
    public Object requestServiceConfig() {
        List<String> services = discoveryClient.getServices();
        LOGGER.info("所有节点信息为:{}", services);
        Map<String, Object> data = Maps.newHashMap();
        data.put("services", services);
        return data;
    }
}
