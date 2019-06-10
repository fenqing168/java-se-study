package cn.fenqing168.builder;

/**
 * @author fenqing
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
