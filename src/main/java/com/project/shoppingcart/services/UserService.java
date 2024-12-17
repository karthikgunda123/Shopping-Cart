package com.project.shoppingcart.services;

import com.project.shoppingcart.models.UserDtls;
import org.springframework.web.multipart.MultipartFile;

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

    void updateUserResetToken(String email, String resetToken);

    UserDtls getUserByToken(String token);

    UserDtls updateUser(UserDtls user);

    UserDtls updateUserProfile(UserDtls user, MultipartFile img);
}
