package com.codecool.bookdb.model;

import java.util.List;

public interface AuthorDao {
    /**
     * Add a new object to database, and set the new ID
     *
     * @param author a new object, with ID not set yet (null)
     */
    void add(Author author);

    /**
     * Update existing object's data in the database
     *
     * @param author an object from the database, with ID already set
     */
    void update(Author author);

    /**
     * Get object by ID
     *
     * @param id ID to search by
     * @return Object with a given ID, or null if not found
     */
    Author get(int id);

    /**
     * Get all objects
     *
     * @return List of all objects of this type in the database
     */
    List<Author> getAll();
}
