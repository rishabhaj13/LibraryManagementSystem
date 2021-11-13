package com.lms_backend.controller;

import com.lms_backend.dto.*;
import com.lms_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "User RESTful APIs", description = "User CRUD operations")
@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserSaveDTO userSaveDTO)
    {
        String username = userService.addUser(userSaveDTO);
        return  "Added Successfully";
    }

    @GetMapping(path = "/getAllUser")
    public List<UserDTO> getAllUser()
    {
        List<UserDTO> allUsers = userService.getAllUser();
        return allUsers;
    }

    @PutMapping(path = "/update")
    public String updateUser(@RequestBody UserUpdateDTO userUpdateDTO)
    {
        String username = userService.updateUser(userUpdateDTO);
        return  username;
    }
    @DeleteMapping(path = "/delete/{id}")
    public String deleteUser(@PathVariable(value = "id")int id)
    {
        String userrname = userService.deleteUser(id);
        return  "deleteddd";
    }

}
