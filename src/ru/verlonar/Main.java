package ru.verlonar;

public class Main {

    public static void main(String[] args) {

        Library library = new Library(10);

        Author author1 = new Author("Vanya", "Ivanov");
        Author author2 = new Author("Petya", "Petrov");

        Book book1 = new Book("First book", author1, 2002);
        Book book2 = new Book("Second book", author2, 2014);

        library.addBook(book1);
        library.addBook(book2);

        library.printBooksInfo();

        library.printBookInfoByName("First book");

        library.changeBookPublicationYearByName("Second book", 2022);
        library.printBookInfoByName("Second book");
        library.printBookInfoByName("Non-existent book");
    }
}
