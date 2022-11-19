package StepDefinitions;

import Pages.Orders;
import Pages.Menu;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Map;

public class MenuManagementSteps {

    @DataTableType
    public Menu menuEntry(Map<String, String> entry) {
        return new Menu(
                entry.get("item"),
                entry.get("price"));
    }

    @Given("we have a menu with following items")
    public void we_have_a_menu_with_following_items(List<Menu> items) {
        Menu.menuItems.addAll(items);
    }

    @When("customer orders {string}")
    public void customer_orders(String customerOrder) {
        Orders.addOrder(customerOrder);
    }

    @Then("verify the customer should pay {int} dollars")
    public void verify_the_customer_should_pay_dollars(Integer total) {
        Assertions.assertSame(total, Orders.totalPrice());
    }
}
