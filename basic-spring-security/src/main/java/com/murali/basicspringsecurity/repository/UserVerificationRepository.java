package com.murali.basicspringsecurity.repository;

import com.murali.basicspringsecurity.entity.UserVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserVerificationRepository extends JpaRepository<UserVerification,Integer> {
    UserVerification getByToken(String token);
}
