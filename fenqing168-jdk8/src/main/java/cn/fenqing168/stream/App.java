package cn.fenqing168.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {

        //1
        String[] strs = {"a", "b", "v"};
        Arrays.stream(strs).forEach(System.out::println);

        //2
        Stream.of(strs).forEach(System.out::println);

        //3
        List<String> stringList = new ArrayList<>();
        Arrays.asList(strs).stream().forEach(stringList::add);
        System.out.println(stringList.size());

        //4
        Iterator<String> iterable = stringList.iterator();
        Stream.iterate(iterable.next(), x -> iterable.next()).limit(stringList.size()).forEach(System.err::println);

        //5
        Stream.generate((() -> new Random().nextInt(100))).limit(10).forEach(System.out::println);

    }

}
