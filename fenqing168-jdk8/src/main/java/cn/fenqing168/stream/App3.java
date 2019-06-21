package cn.fenqing168.stream;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author fenqing
 */
public class App3 {

    public static void main(String[] args) {
        test01();
    }

    public static void craeteStream(){
        Stream<String> stringStream = Stream.empty();
        stringStream.forEach(System.out::println);
    }

    public static void test01(){
        Random random = new Random();
        System.out.println(random.ints().filter(num -> num > 0 && num <= 1000).limit(10).sorted().summaryStatistics().getAverage());
//        random.ints(10,100).forEach(System.out::println);
    }

}
