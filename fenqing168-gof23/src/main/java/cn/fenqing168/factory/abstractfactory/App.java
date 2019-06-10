package cn.fenqing168.factory.abstractfactory;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {

        ComputerFactory computerFactory = new GameComputerFactory();
        Computer computer = new Computer();
        computer.setCpu(computerFactory.productCpu());
        computer.setGpu(computerFactory.productGpu());
        computer.setHardDisk(computerFactory.productHardDisk());
        computer.setMainboard(computerFactory.productMainboard());
        computer.setRam(computerFactory.productRam());
        System.out.println(computer);

    }

}
