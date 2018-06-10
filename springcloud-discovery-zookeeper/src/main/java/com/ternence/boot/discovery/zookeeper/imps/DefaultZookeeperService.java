package com.ternence.boot.discovery.zookeeper.imps;

import com.ternence.boot.discovery.zookeeper.ZookeeperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Zookeeper服务相关的实现
 *
 * @author Ternence
 * @version 1.0
 */
@Service
public class DefaultZookeeperService implements ZookeeperService, InitializingBean, DisposableBean {

    @Resource
    private DiscoveryClient discoveryClient;

    private final static Logger LOGGER = LoggerFactory.getLogger(DefaultZookeeperService.class);

    /**
     * 容器销毁，会通知这个方法执行资源释放和销毁操作
     *
     * @throws Exception *
     */
    @Override
    public void destroy() throws Exception {
        LOGGER.info("destroy bean DefaultZookeeperService");
    }

    /**
     * bean的所有属性都成功设置之后spring会调用这个方法执行用户自己定义的初始化动作
     *
     * @throws Exception *
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("init bean DefaultZookeeperService");
    }

    /**
     * 根据服务的名字获取服务的地址,这个地址包括schema//host:port
     *
     * @param serviceName 服务名称
     * @return 服务访问地址
     */
    @Override
    public String getServiceAddress(Services serviceName) {
        String schema = "http://";
        List<ServiceInstance> services = discoveryClient.getInstances(
                serviceName.getRegistryName());
        if (services != null && services.size() > 0) {
            ServiceInstance instance = services.get(0);
            return schema + instance.getHost() + ":" + instance.getPort();
        }
        return null;
    }
}
