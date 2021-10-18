# Book DB

## Story

Flynn, local librarian, wants to digitalize his good ol' book register. Searching for records in a massive set of massive books is time consuming. 
Your task is to create a simple application that will store books and authors in a PostgreSQL database, and will allow Flynn to add, update, and list all entries.


## What are you going to learn?

- connect to a database using low level technology (JDBC).
- handle edge cases and exceptions.


## Tasks

1. Create a PostgreSQL database called `books` and import both schema and data from `books.sql` file.
    - Database with name `books` exists
    - Tables `book` and `author` are created and filled with sample data

2. Create a class called `BookDbManager` (in a subpackage called `manager`) with a method `connect()` that will link to your `books` database and return `DataSource`. Use `PGSimpleDataSource` to establish connection.
    - Class `BookDbManager` exists, and its `connect()` method connects to the database and returns a `DataSource`.

3. Create `AuthorDaoJdbc` and `BookDaoJdbc` classes in the `model` subpackage. Each one of them must accept a `DataSource` as a constructor parameter. Instances of JDBC DAOs will be managed by `BookDbManager`.
    - Classes `AuthorDaoJdbc` and `BookDaoJdbc` are implemented.
    - Classes `AuthorDaoJdbc` and `BookDaoJdbc` use `PreparedStatement`s.
    - Exceptions are chained and thrown as RuntimeExceptions, to avoid "exception swallowing".

4. Make this app functional with a simple console UI. Implement `UserInterface`'s methods, and call them from `BookDbManager` using a main menu -> submenu workflow. Make sure that the user is able to list and edit all the records, as well as add new ones.
    - Main menu with options `a - Authors`, `b - Books` and `q - Quit` navigates to the selected submenu and is functional
    - Resources menu with options `l - List`, `a - Add`, `e - Edit` and `q - Quit` is functional on the selected entities

## General requirements

None

## Hints

- When you create a `dataSource` object that will be responsible for your connection to the database, remember to check whether the connection actually works. You can do it by invoking `dataSource.getConnection().close();`
- Remember to keep your queries SQL-injection-proof by using `java.sql.PreparedStatement`


## Background materials

- <i class="far fa-exclamation"></i> [PGSimpleDataSource example](https://www.programcreek.com/java-api-examples/index.php?api=org.postgresql.ds.PGSimpleDataSource)
- <i class="far fa-candy-cane"></i> [Book DB step-by-step project guide for Java](project/curriculum/materials/pages/java/book-db-java-guide.md)

