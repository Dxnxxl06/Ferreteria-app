package com.bkseducate.domain.ports;

import com.bkseducate.domain.model.User;
import java.util.Optional;

public interface UserRepositoryPort {
    User save(User user);
    Optional<User> findByEmail(String email); // Vital para el login
    Optional<User> findById(Long id);
}
