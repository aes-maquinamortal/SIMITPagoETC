package com.pagoetc.pagoetc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.google.gson.Gson;
import com.pagoetc.pagoetc.wsdl.EnvioNotificacionUtilidad;
import com.pagoetc.pagoetc.wsdl.EnvioNotificacionUtilidadResponse;
import com.pagoetc.pagoetc.wsdl.Etc;

public class EnvioNotificacionUtilidadClient extends WebServiceGatewaySupport{
	
	public EnvioNotificacionUtilidadResponse envioNotificacionUtilidad(Etc etc,String valor) {
		EnvioNotificacionUtilidad enu = new EnvioNotificacionUtilidad();
		enu.setArg0(etc);
		enu.setArg1("pagoETC");
		Map<String,String> paymap = new HashMap();
		paymap.put("name", etc.getNombre());
		paymap.put("paymentValue", valor);
		Gson g = new Gson();
		enu.setArg2(g.toJson(paymap,HashMap.class));
		
		EnvioNotificacionUtilidadResponse response = (EnvioNotificacionUtilidadResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8082/services/pagoEtc", enu);
		return response;
	}

}
