package com.codecool.bookdb;

import com.codecool.bookdb.manager.BookDbManager;
import com.codecool.bookdb.view.UserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(System.in, System.out);
        new BookDbManager(ui).run();
    }
}
