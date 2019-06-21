package cn.fenqing168.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author fenqing
 */
public class App2 {

    public static void main(String[] args) {

        new ArrayList<String>() {{
            add("a");
            add("b");
            add("cx");
            add("d");
            add("e");
            add("f");
        }}.stream().filter(str -> str.length() > 1).forEach(System.out::println);

        new ArrayList<String>() {{
            add("a");
            add("b");
            add("cx");
            add("d");
            add("e");
            add("f");
        }}.stream().map(x -> x.length()).forEach(System.out::println);

        System.out.println();
        System.out.println();System.out.println();System.out.println();System.out.println();


        new ArrayList<String>() {{
            add("a");
            add("b");
            add("cx");
            add("d");
            add("e");
            add("f");
        }}.stream().map(x -> x.length()).flatMap((str) -> {
            return new ArrayList<String>() {{
                add("a");
                add("b");
                add("cx");
                add("d");
                add("e");
                add("f");
            }}.stream();
        }).forEach(System.out::println);

    }

}
