package com.pagoetc.pagoetc.entidades;

import com.pagoetc.pagoetc.wsdl.Ciudad;
import com.pagoetc.pagoetc.wsdl.Etc;

public class PagoEtcPojo {
	
	private Etc etc;
	private Long valor;
	
	public Etc getEtc() {
		return etc;
	}
	public void setEtc(Etc etc) {
		this.etc = etc;
	}
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	
	
}
