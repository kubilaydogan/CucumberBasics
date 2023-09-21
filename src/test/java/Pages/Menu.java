package Pages;


import io.cucumber.java.bs.A;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Menu {
    private String order;
    private int price;

    public static List<Menu> orders = new ArrayList<>();

    public Menu(String order, String price) {
        this.order = order;
        this.price = Integer.parseInt(price);
    }

    public static Integer priceOf(String item) {
        for(Menu each : orders){
            if(each.getOrder().equalsIgnoreCase(item)){
                return each.getPrice();
            }
        }
        return 0;
    }

    public static List<String> listOfOrders() {
        List<String> result = new ArrayList<>();
        for(Menu each : orders){
            result.add(each.getOrder());
        }
        return result;
    }


}
