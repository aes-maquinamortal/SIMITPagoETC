package com.pagoetc.pagoetc;

import javax.xml.ws.Endpoint;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter {
	
	@Autowired
    private PagoETC pagoetc;
	
	@Bean
    public ServletRegistrationBean wsDispatcherServlet() {
        CXFServlet cxfServlet = new CXFServlet();
        return new ServletRegistrationBean(cxfServlet, "/services/*");
    }

    @Bean(name="cxf")
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint helloWorldEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), pagoetc);
        endpoint.publish("simit");
        return endpoint;
    }

}
