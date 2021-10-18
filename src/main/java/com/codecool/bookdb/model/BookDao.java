package com.codecool.bookdb.model;

import java.util.List;

public interface BookDao {
    void add(Book book);

    void update(Book book);

    Book get(int id);

    List<Book> getAll();
}
