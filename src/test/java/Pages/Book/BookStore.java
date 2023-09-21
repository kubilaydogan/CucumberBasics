package Pages.Book;

import io.cucumber.datatable.DataTable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class BookStore {
    public static List<Book> books = new ArrayList<>();

    public static void addAllBooks(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            addBook(new Book(columns.get("title"), columns.get("author")));
        }
    }

    public static List<Book> getBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> Objects.equals(author, book.getAuthor()))
                .collect(Collectors.toList());
    }

    public static boolean bookExits(String bookName) {
        String result = books.stream()
                .filter(book -> bookName.equals(book.getTitle()))
                .map(book -> book.getTitle())
                .collect(Collectors.joining());

        return result.contentEquals(bookName);
    }

    public static void addBooks(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        for (List<String> columns : rows) {
            addBook(new Book(columns.get(0), columns.get(1)));
        }
    }
    
    public static void addBook(Book book) {
        books.add(book);
    }

}