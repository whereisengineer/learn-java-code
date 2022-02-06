package oops;

import java.util.ArrayList;
import java.util.List;

class Book{
    public String title;
    public String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

class Library{

    private List<Book> books;

    Library(List<Book> books){
        this.books = books;
    }

    public List<Book> getTotalBooks(){
        return books;
    }


}

public class Composition {

    public static void main(String[] args) {
        Book b1 = new Book("Book1", "Auth1");
        Book b2 = new Book("Book2", "Auth2");
        Book b3 = new Book("Book3", "Auth3");
        Book b4 = new Book("Book4", "Auth4");

        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        Library lib = new Library(books);

        List<Book> totalBooks = lib.getTotalBooks();

        for(Book bk: totalBooks){
            System.out.println("Book title: " + bk.title + " " + "Book author: "+ bk.author);
        }
    }
}
