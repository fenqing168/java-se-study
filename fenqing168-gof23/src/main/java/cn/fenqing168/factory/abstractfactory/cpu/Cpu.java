package cn.fenqing168.factory.abstractfactory.cpu;

/**
 * cpu
 * @author fenqing
 */
public abstract class Cpu {

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
