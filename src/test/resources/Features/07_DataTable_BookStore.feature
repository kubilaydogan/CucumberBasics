@BookStore
Feature: Book Store

  Background: Clear the book list
    Given book store is empty

  Scenario: Correct number of books found by author by LIST
    Given I have the following books in the store by list
      | The Devil in the White City          | Erik Larson |
      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
      | In the Garden of Beasts              | Erik Larson |
    When I search for books by author "Erik Larson"
    Then I find 2 books

  Scenario: Correct number of books found by author by MAP
    Given I have the following books in the store by map
      | title                                | author      |
      | The Devil in the White City          | Erik Larson |
      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
      | In the Garden of Beasts              | Erik Larson |
    When I search for books by author "Erik Larson"
    Then I find 2 books

    When I search for books by author "Marcel Proust"
    Then I find 0 books

    When I search for a book titled "The Lion, the Witch and the Wardrobe"
    Then I find 1 book
