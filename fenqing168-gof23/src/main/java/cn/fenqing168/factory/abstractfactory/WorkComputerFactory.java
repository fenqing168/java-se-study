package cn.fenqing168.factory.abstractfactory;

import cn.fenqing168.factory.abstractfactory.cpu.AmdCpu;
import cn.fenqing168.factory.abstractfactory.cpu.Cpu;
import cn.fenqing168.factory.abstractfactory.cpu.IntelCpu;
import cn.fenqing168.factory.abstractfactory.gpu.Gpu;
import cn.fenqing168.factory.abstractfactory.gpu.NvidaGpu;
import cn.fenqing168.factory.abstractfactory.harddisk.HardDisk;
import cn.fenqing168.factory.abstractfactory.harddisk.WesternDigitalHardDisk;
import cn.fenqing168.factory.abstractfactory.mainboard.GigabyteMainboard;
import cn.fenqing168.factory.abstractfactory.mainboard.Mainboard;
import cn.fenqing168.factory.abstractfactory.ram.KingstonRam;
import cn.fenqing168.factory.abstractfactory.ram.Ram;

/**
 * @author fenqing
 */
public class WorkComputerFactory implements ComputerFactory {
    @Override
    public Cpu productCpu() {
        return new IntelCpu();
    }

    @Override
    public Gpu productGpu() {
        return new NvidaGpu();
    }

    @Override
    public HardDisk productHardDisk() {
        return new WesternDigitalHardDisk();
    }

    @Override
    public Mainboard productMainboard() {
        return new GigabyteMainboard();
    }

    @Override
    public Ram productRam() {
        return new KingstonRam();
    }
}
