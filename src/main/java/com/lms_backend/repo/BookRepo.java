package com.lms_backend.repo;

import com.lms_backend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer > {
}
