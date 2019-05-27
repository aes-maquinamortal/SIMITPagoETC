package com.pagoetc.pagoetc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class NotificacionConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.pagoetc.pagoetc.wsdl");
		return marshaller;
	}

	@Bean
	public EnvioNotificacionUtilidadClient countryClient(Jaxb2Marshaller marshaller) {
		EnvioNotificacionUtilidadClient client = new EnvioNotificacionUtilidadClient();
		client.setDefaultUri("http://localhost:8082/services/pagoEtc");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
