package cn.fenqing168.singleton.eager;

/**
 * 懒汉式单例模式，会有线程安全问题
 * @author fenqing
 */
public class Singleton {

    private static Test TEXT = new Test();

    public static Test getInstance(){
        return TEXT;
    }

}

class Test{

    public Test() {
        System.out.println("x");
    }
}
