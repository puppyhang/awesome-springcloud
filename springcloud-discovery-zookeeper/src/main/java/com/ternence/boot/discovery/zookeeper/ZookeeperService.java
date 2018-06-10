package com.ternence.boot.discovery.zookeeper;

/**
 * Zookeeper服务
 *
 * @author Ternence
 * @version 1.0
 */
public interface ZookeeperService {

    String getServiceAddress(Services serviceName);

    enum Services {

        SPRING_CLOUD_DISCOVERY("spring-cloud-discovery");

        String registryName;

        Services(String registryName) {
            this.registryName = registryName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }
}
