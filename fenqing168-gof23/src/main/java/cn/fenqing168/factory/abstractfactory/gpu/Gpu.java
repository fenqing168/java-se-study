package cn.fenqing168.factory.abstractfactory.gpu;

/**
 * gpu
 * @author fenqing
 */
public abstract class Gpu {

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
