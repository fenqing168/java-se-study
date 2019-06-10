package cn.fenqing168.builder;

/**
 * @author fenqing
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 30.0F;
    }
}
