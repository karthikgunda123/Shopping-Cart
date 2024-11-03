package com.project.shoppingcart.services.implementations;

import com.project.shoppingcart.models.UserDtls;
import com.project.shoppingcart.repositories.UserRepository;
import com.project.shoppingcart.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDtls saveUser(UserDtls userDtls) {
        return userRepository.save(userDtls);
    }
}
