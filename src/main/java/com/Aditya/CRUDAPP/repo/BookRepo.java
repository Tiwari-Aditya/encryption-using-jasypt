package com.Aditya.CRUDAPP.repo;

import com.Aditya.CRUDAPP.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
