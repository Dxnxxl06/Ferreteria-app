package com.bkseducate.domain.ports;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.bkseducate.domain.model.DamageReport;

public interface DamageReportRepositoryPort {
    DamageReport save (DamageReport damageReport);
    //Optional ya que se hace busqueda para una sola opcion o si no hay
    Optional<DamageReport> findById(Long Id);
    Optional<DamageReport> findByrentalId(Long rentalId);
    Optional<DamageReport> findBydamageDescription(String damageDescription);
    //List ya explique en la otra pq xd
    List<DamageReport> findBydamageCost (BigDecimal damageCost);
}
