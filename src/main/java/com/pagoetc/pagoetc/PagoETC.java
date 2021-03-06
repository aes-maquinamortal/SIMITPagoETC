package com.pagoetc.pagoetc;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.pagoetc.pagoetc.entidades.Pago;
import com.pagoetc.pagoetc.repositories.PagoRepository;
import com.pagoetc.pagoetc.wsdl.EnvioNotificacion;
import com.pagoetc.pagoetc.wsdl.EnvioNotificacionProxy;
import com.pagoetc.pagoetc.wsdl.Etc;

@Component
public class PagoETC {
	
	private static EnvioNotificacion envioNotification = new EnvioNotificacionProxy();
	
	@Autowired
	PagoRepository pagorepository;
	
	@WebMethod(action = "pagoEtcEntidad")
	public void pagoEtcEntidad(Etc etc, Long pago) {
		pago(etc,pago);
	}
	
	public String pago(Etc etc , Long pago) {
		try {
			Gson gson = new Gson();
			Long percentage = calculatePercentageRules(etc.getCiudad().isRural(),etc.getNombre());
			Double value = pago.doubleValue() * (percentage.doubleValue()/100);
			if(makePsuRequest(value, etc.getCuentaBancaria())) {
				Map<String,String> paymap = new HashMap<String,String>();
				paymap.put("name", etc.getNombre());
				paymap.put("paymentValue", value.toString());
				
				envioNotification.envioNotificacionUtilidad(etc,"pagoETC", gson.toJson(paymap, HashMap.class));
				return pagorepository.save(new Pago(new Date(), percentage.doubleValue(), value, etc.getCorreo())).getId().toString();				
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	private boolean makePsuRequest(double value, String cuentaBancaria) {
		return true;
	}
	
	private Long calculatePercentageRules(Boolean rural, String etc) {
		Map<String,Long> mapaRural = new HashMap<String, Long>();
		mapaRural.put("SIMIT", 15L);
		mapaRural.put("Secretaria Movilidiad", 40L);
		mapaRural.put("Policia Carretera", 40L);
		
		Map<String,Long> mapaUrbano = new HashMap<String, Long>();
		mapaUrbano.put("SIMIT", 10L);
		mapaUrbano.put("Secretaria Movilidiad", 80L);
		mapaUrbano.put("Policia Carretera", 0L);
		
		if(rural) {
			return mapaRural.get(etc);
		}else {
			return mapaUrbano.get(etc);
		}
		
	}

}
