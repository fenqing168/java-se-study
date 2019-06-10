package cn.fenqing168.builder;

/**
 * @author fenqing
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
