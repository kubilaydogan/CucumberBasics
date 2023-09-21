package StepDefinitions.BookStore;

import Pages.Book.BookStore;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookStore_Steps {
    int countOfBooks;

    @Given("I have the following books in the store by list")
    public void haveBooksInTheStoreByList(DataTable dataTable) {
        BookStore.addBooks(dataTable);
    }

    @Given("I have the following books in the store by map")
    public void haveBooksInTheStoreByMap(DataTable dataTable) {
        BookStore.addAllBooks(dataTable);
    }

    @Then("verify {int} book/books by author {string} exist")
    public void verify_books_by_author_exist(int count, String authorName) {
        assertEquals(BookStore.getBooksByAuthor(authorName).size(), count);
    }


    @Then("verify a book titled {string} exist in Bookstore")
    public void verifyABookTitledExistInBookstore(String bookName) {
        assertTrue(BookStore.bookExits(bookName));
    }

    @Given("book store is empty")
    public void bookStoreIsEmpty() {
        BookStore.books.clear();
        countOfBooks = 0;
    }
}
