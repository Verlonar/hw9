package ru.verlonar;

public class Library {
    private Book[] books;

    public Library(int arrayLength) {
        books = new Book[arrayLength];
    }

    public void addBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }
    }

    public void printBooksInfo() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(
                        book.getAuthor().toString()
                                + ": "
                                + book.getName()
                                + ": "
                                + book.getPublicationYear());
            }
        }
    }

    public void printBookInfoByName(String bookName) {
        int index = findBookArrayIndexByName(bookName);
        if (index >= 0) {
            Book book = books[index];
            System.out.println(
                    "The "
                            + book.getName()
                            + " by "
                            + book.getAuthor().toString()
                            + " was published in "
                            + book.getPublicationYear());
        } else {
            System.out.println("Книга с таким именем не найдена");
        }
    }

    public void changeBookPublicationYearByName(String bookName, int newPublicationYear) {
        int index = findBookArrayIndexByName(bookName);
        if (index >= 0) {
            books[index].setPublicationYear(newPublicationYear);
        } else {
            System.out.println("Книга с таким именем не найдена");
        }
    }

    private int findBookArrayIndexByName(String name) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] != null && books[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
