package com.lms_backend.service;

import com.lms_backend.dto.BookDTO;
import com.lms_backend.dto.BookSaveDTO;
import com.lms_backend.dto.BookUpdateDTO;

import java.util.List;

public interface BookService {
    String addBook(BookSaveDTO bookSaveDTO);
    List<BookDTO> getAllBook();
    String updateBook(BookUpdateDTO bookUpdateDTO);
    String deleteBook(int id);
}
