package cn.fenqing168.singleton.doublelock;

/**
 * 懒汉式单例模式，会有线程安全问题
 * @author fenqing
 */
public class Singleton {

    private static Test TEXT;

    public static Test getInstance(){
        if(TEXT == null){
            synchronized (Singleton.class){
                if(TEXT == null){
                    TEXT = new Test();
                }
            }
        }
        return TEXT;
    }

}

class Test{

    public Test() {
        System.out.println("x");
    }
}
