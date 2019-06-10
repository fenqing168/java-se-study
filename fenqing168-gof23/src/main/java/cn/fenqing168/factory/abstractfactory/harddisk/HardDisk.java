package cn.fenqing168.factory.abstractfactory.harddisk;

/**
 * 硬盘
 * @author fenqing
 */
public abstract class HardDisk {

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
