package com.pagoetc.pagoetc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pagoetc.pagoetc.entidades.Pago;

public interface PagoRepository extends JpaRepository<Pago, Long> {

}
