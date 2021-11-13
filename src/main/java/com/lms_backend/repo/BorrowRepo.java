package com.lms_backend.repo;

import com.lms_backend.dto.BorrowDTO;
import com.lms_backend.dto.BorrowSaveDTO;
import com.lms_backend.entity.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BorrowRepo extends JpaRepository<Borrow,Integer > {
}
