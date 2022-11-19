package Pages;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Menu {
    private String item;
    private int price;

    public static List<Menu> menuItems = new ArrayList<>();

    public Menu(String item, String price) {
        this.item = item;
        this.price = Integer.parseInt(price);
    }

    public static Integer priceOf(String item) {
        for(Menu each : menuItems){
            if(each.getItem().equalsIgnoreCase(item)){
                return each.getPrice();
            }
        }
        return 0;
    }


}
