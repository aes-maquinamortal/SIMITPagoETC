package com.pagoetc.pagoetc.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pago {
	
	@Id
	private Long id;
	
	private Date fecha;
	
	private Double porcentaje;
	
	private Double valor;
	
	private String etc;
	
	public Pago() {}

	public Pago(Long id, Date fecha, Double porcentaje, Double valor, String etc) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.porcentaje = porcentaje;
		this.valor = valor;
		this.etc = etc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	
	
}
