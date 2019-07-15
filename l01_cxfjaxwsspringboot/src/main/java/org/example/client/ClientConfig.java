package org.example.client;

import com.codenotfound.services.helloworld.HelloWorldPortType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Value("${client.ticketagent.address}")
    private String address;

    @Bean(name = "helloWorldProxy")
    public HelloWorldPortType helloWorldPortType() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();

        jaxWsProxyFactoryBean.setServiceClass(HelloWorldPortType.class);
        jaxWsProxyFactoryBean.setAddress(address);

        return (HelloWorldPortType) jaxWsProxyFactoryBean.create();
    }
}
