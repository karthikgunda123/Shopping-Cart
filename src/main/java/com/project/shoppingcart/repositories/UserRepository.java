package com.project.shoppingcart.repositories;

import com.project.shoppingcart.models.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserDtls, Integer> {
    UserDtls findByEmail(String username);

    List<UserDtls> findByRole(String role);
}
