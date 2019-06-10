package cn.fenqing168.factory.abstractfactory;

import cn.fenqing168.factory.abstractfactory.cpu.Cpu;
import cn.fenqing168.factory.abstractfactory.gpu.Gpu;
import cn.fenqing168.factory.abstractfactory.harddisk.HardDisk;
import cn.fenqing168.factory.abstractfactory.mainboard.Mainboard;
import cn.fenqing168.factory.abstractfactory.ram.Ram;

/**
 * 电脑工厂
 * @author fenqing
 */
public interface ComputerFactory {

    /**
     * 生产Cpu
     * @return
     */
    Cpu productCpu();

    /**
     * 生产Gpu
     * @return
     */
    Gpu productGpu();

    /**
     * 生产硬盘
     * @return
     */
    HardDisk productHardDisk();

    /**
     * 生产主板
     * @return
     */
    Mainboard productMainboard();

    /**
     * 生产内存
     * @return
     */
    Ram productRam();

}
