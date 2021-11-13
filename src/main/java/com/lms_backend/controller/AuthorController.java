package com.lms_backend.controller;

import com.lms_backend.dto.AuthorDTO;
import com.lms_backend.dto.AuthorSaveDTO;
import com.lms_backend.dto.AuthorUpdateDTO;
import com.lms_backend.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Author RESTful APIs", description = "Author CRUD operations")
@RestController
@CrossOrigin
@RequestMapping("api/v1/author")
public class AuthorController {


    @Autowired
    private AuthorService authorService;

    @Operation(summary = "Add Author")
    @PostMapping(path = "/save")
    public String saveAuthor(@RequestBody AuthorSaveDTO authorSaveDTO)
    {
        String authorname = authorService.addAuthor(authorSaveDTO);
        return  "Added Successfully";
    }

    @Operation(summary = "List Authors")
    @GetMapping(path = "/getAllAuthor")
    public List<AuthorDTO> getAllAuthor()
    {
        List<AuthorDTO> allAuthors = authorService.getAllAuthor();
        return allAuthors;
    }

    @Operation(summary = "Update Author")
    @PutMapping(path = "/update")
    public String updateAuthor(@RequestBody AuthorUpdateDTO authorUpdateDTO)
    {
        String authorname = authorService.updateAuthor(authorUpdateDTO);
        return  authorname;
    }

    @Operation(summary = "Delete Author")
    @DeleteMapping(path = "/delete/{id}")
    public String deleteAuthor(@PathVariable(value = "id")int id)
    {
        String authorname = authorService.deleteAuthor(id);
        return  "deleteddd";
    }


}