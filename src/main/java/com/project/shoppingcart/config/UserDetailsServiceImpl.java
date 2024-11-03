package com.project.shoppingcart.config;

import com.project.shoppingcart.models.UserDtls;
import com.project.shoppingcart.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDtls userDtls = userRepository.findByEmail(username);

        if (userDtls == null) {
            throw new UsernameNotFoundException("user not found");
        }
        return new CustomUser(userDtls);
    }
}
