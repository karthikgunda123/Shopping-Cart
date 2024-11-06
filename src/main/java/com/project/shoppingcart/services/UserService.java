package com.project.shoppingcart.services;

import com.project.shoppingcart.models.UserDtls;

import java.util.List;

public interface UserService {
    UserDtls saveUser(UserDtls userDtls);

    UserDtls getUserByEmail(String email);

    List<UserDtls> getUsers(String role);

    Boolean updateAccountStatus(Integer id, Boolean status);

    void increaseFailedAttempt(UserDtls user);

    void userAccountLock(UserDtls user);

    boolean unlockAccountTimeExpired(UserDtls user);

    void resetAttempt(int userId);
}
