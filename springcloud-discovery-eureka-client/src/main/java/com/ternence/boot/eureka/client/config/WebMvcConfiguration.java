package com.ternence.boot.eureka.client.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * web相关内容的配置类
 *
 * @author Ternence
 * @version 1.0
 */
@SpringBootConfiguration
public class WebMvcConfiguration {
    /**
     * 配置http消息转换类
     *
     * @return HttpMessageConverters
     */
    @Bean
    public HttpMessageConverters httpMessageConverters() {

        return new HttpMessageConverters(new MappingJackson2HttpMessageConverter());
    }
}
