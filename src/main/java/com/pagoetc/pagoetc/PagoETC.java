package com.pagoetc.pagoetc;

import java.util.Date;

import javax.jws.WebMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pagoetc.pagoetc.entidades.Pago;
import com.pagoetc.pagoetc.repositories.PagoRepository;
import com.pagoetc.pagoetc.wsdl.EnvioNotificacionUtilidadResponse;
import com.pagoetc.pagoetc.wsdl.Etc;

@Component
public class PagoETC {
	
	@Autowired
	EnvioNotificacionUtilidadClient enuc;
	
	@Autowired
	PagoRepository pagorepository;
	
	@WebMethod(action = "pagoEtcEntidad")
	public void pagoEtc() {
		System.out.println("Entro");
		Etc etc = new Etc();
		etc.setNombre("hola");
		etc.setCorreo("hola@gmail.com");
		pagorepository.save(new Pago(1L, new Date(), new Double(5), new Double(5000), etc.getCorreo()));
		EnvioNotificacionUtilidadResponse enur = enuc.envioNotificacionUtilidad(etc, "50000");
		
	}

}
