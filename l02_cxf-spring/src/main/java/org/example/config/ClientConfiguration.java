package org.example.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.example.service.ServiceEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {

    @Bean(name = "client")
    public Object generateProxy() {
        return proxyFactoryBean().create();
    }

    @Bean
    public JaxWsProxyFactoryBean proxyFactoryBean() {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(ServiceEndpoint.class);
        proxyFactory.setAddress("http://localhost:8081/services/simple");
        return proxyFactory;
    }
}

