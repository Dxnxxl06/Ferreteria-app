package com.bkseducate.domain.ports;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.bkseducate.domain.model.Payment;

public interface PaymentRepositoryPort {
    Payment save (Payment payment);
    //Busquedas unicas
    Optional<Payment> findById(Long id);
    Optional<Payment> findByrentalId(Long rentalId);
    //Busquedas por List (Muchas coinciden)
    List<Payment> findBypaymentDate(String paymentDate);
    List<Payment> findBypaymentMethod(String paymentMethod);
    List<Payment> findBytotalAmout(BigDecimal totalAmount);
}
