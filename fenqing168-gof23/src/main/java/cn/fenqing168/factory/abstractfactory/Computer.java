package cn.fenqing168.factory.abstractfactory;

import cn.fenqing168.factory.abstractfactory.cpu.Cpu;
import cn.fenqing168.factory.abstractfactory.gpu.Gpu;
import cn.fenqing168.factory.abstractfactory.harddisk.HardDisk;
import cn.fenqing168.factory.abstractfactory.mainboard.Mainboard;
import cn.fenqing168.factory.abstractfactory.ram.Ram;

/**
 * @author fenqing
 */
public class Computer {

    private Cpu cpu;

    private Gpu gpu;

    private HardDisk hardDisk;

    private Mainboard mainboard;

    private Ram ram;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Mainboard getMainboard() {
        return mainboard;
    }

    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "我的电脑配置：{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", hardDisk=" + hardDisk +
                ", mainboard=" + mainboard +
                ", ram=" + ram +
                '}';
    }
}
