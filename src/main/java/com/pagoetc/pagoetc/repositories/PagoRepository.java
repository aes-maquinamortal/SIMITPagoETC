package com.pagoetc.pagoetc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pagoetc.pagoetc.entidades.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {

}
