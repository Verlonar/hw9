package ru.verlonar;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Vanya", "Ivanov");
        Author author2 = new Author("Petya", "Petrov");

        Book book1 = new Book("First book", author1, 2002);
        Book book2 = new Book("Second book", author2, 2014);

        System.out.println(book1);

        book1.setPublicationYear(2010);

        System.out.println(book1);
        System.out.println(book2);
    }
}
