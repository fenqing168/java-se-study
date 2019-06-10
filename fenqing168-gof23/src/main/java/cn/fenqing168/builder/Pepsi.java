package cn.fenqing168.builder;

/**
 * @author fenqing
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百世可乐";
    }

    @Override
    public float price() {
        return 35.0F;
    }
}
