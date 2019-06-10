package cn.fenqing168.singleton.lazy;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        multithreading();
    }

    public static void singleThread(){
        for(int i = 0; i < 10; i++){
            System.out.println(Singleton.getInstance());
        }
    }

    public static void multithreading(){
        for(int i = 0; i < 20; i++){
            new Thread(()-> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Singleton.getInstance());
            }).start();
        }
    }

}
