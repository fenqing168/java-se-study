package cn.fenqing168.defaultmethod;

import java.util.Arrays;
import java.util.List;

/**
 * @author fenqing
 */
public class Limousine implements Car {

    @Override
    public void printName() {
        Arrays.asList("奔驰", "宝马").forEach(System.out::println);
    }
}
