package cn.fenqing168.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fenqing
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("菜品 : "+item.name());
            System.out.print(", 包装 : "+item.packing().pack());
            System.out.println(", 价格 : "+item.price());
        }
    }

}
