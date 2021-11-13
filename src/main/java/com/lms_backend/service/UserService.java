package com.lms_backend.service;

import com.lms_backend.dto.UserDTO;
import com.lms_backend.dto.UserSaveDTO;
import com.lms_backend.dto.UserUpdateDTO;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);
    List<UserDTO> getAllUser();
    String updateUser(UserUpdateDTO userUpdateDTO);
    String deleteUser(int id);
}
