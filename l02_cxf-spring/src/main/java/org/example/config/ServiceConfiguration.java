package org.example.config;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.example.service.ServiceEndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class ServiceConfiguration {

    @Bean
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), new ServiceEndpointImpl());
        endpoint.publish("http://localhost:8081/services/simple");
        return endpoint;
    }
}
