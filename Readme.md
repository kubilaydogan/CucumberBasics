## Running Tests 

### How to run tests based on tags
**Before:**

`mvn test -Dcucumber.options="--tags @tagname"`

**Now:**

`mvn test -Dcucumber.filter.tags="@tagname"`

`mvn test -Dcucumber.filter.tags="@tagname and not @tagname"`

### How to run specific scenario from a feature file
(Specify a particular scenario by *line*)

`mvn test -Dcucumber.options="src/test/resources/Features/07_DataTable_BookStore.feature:15"`





