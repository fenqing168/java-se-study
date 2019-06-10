package cn.fenqing168.builder;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {

        MealBuilder MealBuilder = new MealBuilder();
        MealBuilder.prepareNonVegMeal().showItems();
        MealBuilder.prepareVegMeal().showItems();

    }

}
