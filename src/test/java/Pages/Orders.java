package Pages;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Orders {

    private String item;
    private int price;

    public static List<Orders> orders = new ArrayList<>();

    public Orders(String item) {
        this.item = item;
        this.price = Menu.priceOf(item);
    }

    public static void addOrder(String order) {
        orders.add(new Orders(order));
    }

    public static Integer totalPrice() {
        int total = 0;
        for(Orders each : orders){
            total += each.getPrice();
        }
        return total;
    }


}
