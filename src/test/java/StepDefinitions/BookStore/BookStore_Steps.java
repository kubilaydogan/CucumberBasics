package StepDefinitions.BookStore;

import Pages.Book.Book;
import Pages.Book.BookStore;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookStore_Steps {
    int countOfBooks;

    @DataTableType
    public Book bookEntry(Map<String, String> entry) {
        return new Book(
                entry.get("title"),
                entry.get("author"));
    }

    @Given("I have the following books in the store by map")
    public void haveBooksInTheStoreByMap(List<Book> bookList) {
        BookStore.books.addAll(bookList);
        // the bookEntry is used here
    }

    @Given("I have the following books in the store by list")
    public void haveBooksInTheStoreByList(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        for (List<String> columns : rows) {
            BookStore.addBook(new Book(columns.get(0), columns.get(1)));
        }
    }

    @When("I search for books by author {string}")
    public void search_for_books_by_author(String author) {

        countOfBooks = BookStore.getCountOfBooksByAuthor(author);
    }

    @When("I search for a book titled {string}")
    public void search_for_a_book(String title) {
        countOfBooks = BookStore.getCountOfBooksByTitle(title);
    }


    @Then("I find {int} book/books")
    public void i_find_books(int count) {
        assertEquals(countOfBooks, count);
    }

    @Given("book store is empty")
    public void bookStoreIsEmpty() {
        BookStore.books.clear();
        countOfBooks = 0;
    }
}
