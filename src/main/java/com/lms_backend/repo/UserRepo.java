package com.lms_backend.repo;

import com.lms_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer > {
}
