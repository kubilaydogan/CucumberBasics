@BookStore
Feature: Book Store

  Background: Clear the book list
    Given book store is empty

  Scenario: Correct number of books found by author by LIST
    Given I have the following books in the store by list
      | The Devil in the White City          | Erik Larson |
      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
      | In the Garden of Beasts              | Erik Larson |
    Then verify 2 books by author "Erik Larson" exist
    Then verify a book titled "The Lion, the Witch and the Wardrobe" exist in Bookstore



  Scenario: Correct number of books found by author by MAP
    Given I have the following books in the store by map
      | title                                | author      |
      | The Devil in the White City          | Erik Larson |
      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
      | In the Garden of Beasts              | Erik Larson |

    Then verify 2 books by author "Erik Larson" exist
    Then verify 1 book by author "C.S. Lewis" exist
    Then verify 0 books by author "Marcel Proust" exist
    Then verify a book titled "The Lion, the Witch and the Wardrobe" exist in Bookstore
