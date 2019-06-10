package cn.fenqing168.factory.abstractfactory.ram;

/**
 * 内存
 * @author fenqing
 */
public abstract class Ram {

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
