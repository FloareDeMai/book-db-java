package com.codecool.bookdb.manager;

import com.codecool.bookdb.view.UserInterface;

public abstract class Manager {

    protected UserInterface ui;

    public Manager(UserInterface ui) {
        this.ui = ui;
    }

    public void run(){
        boolean running = true;

        while (running){
            ui.printTitle(getName());
            ui.printOption('l', "List");
            ui.printOption('a', "Add");
            ui.printOption('e', "Edit");
            ui.printOption('q', "Quit");

            switch (ui.choice("laeq")){
                case 'l' -> list();
                case 'a' -> add();
                case 'e' -> edit();
                case 'q' -> running = false;
            }
       
        }
    }

    protected abstract void list();

    protected abstract void add();

    protected abstract void edit();

    protected abstract String getName();


}
