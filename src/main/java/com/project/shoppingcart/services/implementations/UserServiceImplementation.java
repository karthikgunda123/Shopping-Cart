package com.project.shoppingcart.services.implementations;

import com.project.shoppingcart.models.UserDtls;
import com.project.shoppingcart.repositories.UserRepository;
import com.project.shoppingcart.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDtls saveUser(UserDtls userDtls) {
        userDtls.setRole("ROLE_USER");
        String encodedPassword = passwordEncoder.encode(userDtls.getPassword());
        userDtls.setPassword(encodedPassword);
        return userRepository.save(userDtls);
    }
}
