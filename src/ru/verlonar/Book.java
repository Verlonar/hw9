package ru.verlonar;

public class Book {

    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append("Книга называется: ").append(name).append("\n")
                .append("Атор: ").append(author.toString()).append("\n")
                .append("Год выпуска: ").append(publicationYear).append("\n");
        return sb.toString();
    }
}
