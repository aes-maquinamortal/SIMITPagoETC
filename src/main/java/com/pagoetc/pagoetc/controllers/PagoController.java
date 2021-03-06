/**
 * 
 */
package com.pagoetc.pagoetc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pagoetc.pagoetc.PagoETC;
import com.pagoetc.pagoetc.entidades.PagoEtcPojo;

/**
 * @author miguel
 *
 */
@RestController
public class PagoController {
	
	@Autowired
	private PagoETC pagoEtc;
	
	@RequestMapping(path = "/pagoETC", method = RequestMethod.POST)
	@CrossOrigin
	public String pagoETC(@RequestBody PagoEtcPojo etc) {
		return pagoEtc.pago(etc.getEtc(),etc.getValor());
	}

}
