package com.lms_backend.service;

import com.lms_backend.dto.AuthorDTO;
import com.lms_backend.dto.AuthorSaveDTO;
import com.lms_backend.dto.AuthorUpdateDTO;

import java.util.List;

public interface AuthorService {
    String addAuthor(AuthorSaveDTO authorSaveDTO);
    List<AuthorDTO> getAllAuthor();
    String updateAuthor(AuthorUpdateDTO authorUpdateDTO);
    String deleteAuthor(int id);
}