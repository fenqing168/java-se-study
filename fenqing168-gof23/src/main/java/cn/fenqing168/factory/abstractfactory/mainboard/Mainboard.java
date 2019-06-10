package cn.fenqing168.factory.abstractfactory.mainboard;

/**
 * 主板
 * @author fenqing
 */
public abstract class Mainboard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
