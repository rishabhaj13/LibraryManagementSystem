package com.lms_backend.service;

import com.lms_backend.dto.BorrowDTO;
import com.lms_backend.dto.BorrowSaveDTO;
import com.lms_backend.dto.BorrowUpdateDTO;

import java.util.List;

public interface BorrowService {
    String addBorrow(BorrowSaveDTO borrowSaveDTO);
    List<BorrowDTO> getAllBorrow();
    String updateBorrow(BorrowUpdateDTO borrowUpdateDTO);
}
