package com.pagoetc.pagoetc.entidades;

import com.pagoetc.pagoetc.wsdl.Ciudad;
import com.pagoetc.pagoetc.wsdl.Etc;

public class PagoEtcPojo {
	
	private Etc etc;
	private Long valor;
	private Ciudad ciudad;
	
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
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
