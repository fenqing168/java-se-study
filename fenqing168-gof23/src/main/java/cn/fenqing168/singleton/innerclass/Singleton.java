package cn.fenqing168.singleton.innerclass;

/**
 * 懒汉式单例模式，会有线程安全问题
 * @author fenqing
 */
public class Singleton {

    private static class SingletonProperty{
        private static Test TEXT = new Test();
    }

    public static Test getInstance(){
        return SingletonProperty.TEXT;
    }



}

class Test{

    public Test() {
        System.out.println("x");
    }
}
