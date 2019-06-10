package cn.fenqing168.factory.abstractfactory;

import cn.fenqing168.factory.abstractfactory.cpu.AmdCpu;
import cn.fenqing168.factory.abstractfactory.cpu.Cpu;
import cn.fenqing168.factory.abstractfactory.gpu.AmdGpu;
import cn.fenqing168.factory.abstractfactory.gpu.Gpu;
import cn.fenqing168.factory.abstractfactory.harddisk.HardDisk;
import cn.fenqing168.factory.abstractfactory.harddisk.ToshibaHardDisk;
import cn.fenqing168.factory.abstractfactory.mainboard.AsusMainboard;
import cn.fenqing168.factory.abstractfactory.mainboard.Mainboard;
import cn.fenqing168.factory.abstractfactory.ram.Ram;
import cn.fenqing168.factory.abstractfactory.ram.SamsungRam;

/**
 * 游戏电脑
 * @author fenqing
 */
public class GameComputerFactory implements ComputerFactory {


    @Override
    public Cpu productCpu() {
        return new AmdCpu();
    }

    @Override
    public Gpu productGpu() {
        return new AmdGpu();
    }

    @Override
    public HardDisk productHardDisk() {
        return new ToshibaHardDisk();
    }

    @Override
    public Mainboard productMainboard() {
        return new AsusMainboard();
    }

    @Override
    public Ram productRam() {
        return new SamsungRam();
    }
}
