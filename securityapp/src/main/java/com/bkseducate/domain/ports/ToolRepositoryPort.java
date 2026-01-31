package com.bkseducate.domain.ports;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.bkseducate.domain.model.Tool;

public interface ToolRepositoryPort {
    Tool save(Tool tool);
    //Busqueda con Optional ya que este trae un solo elemento
    Optional<Tool> findById(Long id);
    Optional<Tool> findByName(String name);
    //Busqueda por lista ya que pueden haber varios articulos que cumplan con la misma regla
    List<Tool> findByType(String type);
    List<Tool> findByStatus(String status);
    List<Tool> findByproviderId(Long providerId);
    List<Tool> findBypricePerDay(BigDecimal priicePerDay);
}
