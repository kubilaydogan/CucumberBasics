package StepDefinitions;

import Pages.Orders;
import Pages.Menu;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
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
        Menu.orders.addAll(items);
    }

    @When("customer orders {string}")
    public void customer_orders(String customerOrder) {
        Orders.addOrder(customerOrder);
    }

    @Then("verify the customer should pay {int} dollars")
    public void verify_the_customer_should_pay_dollars(Integer total) {
        Assertions.assertSame(total, Orders.totalPrice());
    }

    @Then("verify orders")
    public void verifyOrders(List<String> orders) {
        // System.out.println(orders);
        Assertions.assertEquals(orders, Menu.listOfOrders());
    }

    @Then("verify the orders")
    public void verifyTheOrders(String orders) {
        // System.out.println(orders);
        List expected = new ArrayList(Arrays.asList(orders.split(",")));
        Assertions.assertEquals(expected, Menu.listOfOrders());
    }
}
