package cn.fenqing168.builder;

/**
 * @author fenqing
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 50.5F;
    }
}
