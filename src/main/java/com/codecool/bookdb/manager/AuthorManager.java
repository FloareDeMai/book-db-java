package com.codecool.bookdb.manager;

import com.codecool.bookdb.model.Author;
import com.codecool.bookdb.model.AuthorDao;
import com.codecool.bookdb.view.UserInterface;

import java.sql.Date;

public class AuthorManager extends Manager{
    AuthorDao authorDao;

    public AuthorManager(UserInterface ui, AuthorDao authorDao){
        super(ui);
        this.authorDao = authorDao;

    }

    @Override
    protected void list() {
        for(Author author: authorDao.getAll()){
            ui.println(author);
        }

    }

    @Override
    protected void add() {
        String firstName = ui.readString("First name", "X");
        String lastName = ui.readString("Last name", "Y");
        Date birthDate = ui.readDate("Birth date", Date.valueOf("1900-01-01"));
        authorDao.add(new Author(firstName, lastName, birthDate));

    }

    @Override
    protected void edit() {
        int id = ui.readInt("Author ID", 0);
        Author author = authorDao.get(id);
        if(author == null){
            ui.println("Author not found!");
            return;
        }
        ui.println(author);

        String firstName = ui.readString("First name", author.getFirstName());
        String lastName = ui.readString("Last name:", author.getLastName());
        Date birthDate = ui.readDate("Birth date", author.getBirthDate());

        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setBirthDate(birthDate);

        authorDao.update(author);
    }

    @Override
    protected String getName() {
        return "Author Manager";
    }


}
