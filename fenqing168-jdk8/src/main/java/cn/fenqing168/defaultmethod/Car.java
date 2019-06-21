package cn.fenqing168.defaultmethod;

/**
 * @author fenqing
 */
public interface Car {

    default void printName(){
        System.out.println("车子");
    }

}
