package com.bkseducate.domain.ports;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.bkseducate.domain.model.Rental;

public interface RentalRepositoryPort {
    Rental save (Rental rental);
    //Busquedas unicas
    Optional<Rental> findById(Long id);

    //Busquedas por List (Varios coinciden)
    List<Rental> findByrentalDate(LocalDate rentalDate);
    List<Rental> findByreturnDate(LocalDate returnDate);
    List<Rental> findBytotalAmount(BigDecimal totalAmount);
    List<Rental> findByrentalStatus(String rentalStatus);
    List<Rental> findByuserId(Long userId);
    List<Rental> findBytoolId(Long toolId);
    
    
}
