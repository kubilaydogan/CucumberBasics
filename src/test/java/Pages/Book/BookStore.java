package Pages.Book;

import java.util.*;

public class BookStore {
    public static List<Book> books = new ArrayList<>();

    public static Integer getCountOfBooksByAuthor(String author) {
        int count = 0;
        for(Book each : books){
            if(each.getAuthor().equalsIgnoreCase(author)){
                count += 1;
            }
        }
        return count;
    }

    public static Integer getCountOfBooksByTitle(String title) {
        int count = 0;
        for(Book each : books){
            if(each.getTitle().equalsIgnoreCase(title)){
                count += 1;
            }
        }
        return count;
    }


    public static void addBook(Book book) {
        books.add(book);
    }
//
//    public void addAllBooks(Collection<Book> books) {
//        this.books.addAll(books);
//    }
//
//    public List<Book> booksByAuthor(String author) {
//        return books.stream()
//                .filter(book -> Objects.equals(author, book.getAuthor()))
//                .collect(Collectors.toList());
//    }
//
//    public Optional<Book> bookByTitle(String title) {
//        return books.stream()
//                .filter(book -> book.getTitle().equals(title))
//                .findFirst();
//    }
}

/*
    Optional is a container object used to contain not-null objects.
    Optional object is used to represent null with absent value.
    This class has various utility methods to facilitate code to
    handle values as 'available' or 'not available' instead of checking null values.
 */