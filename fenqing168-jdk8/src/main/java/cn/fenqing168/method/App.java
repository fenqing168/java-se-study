package cn.fenqing168.method;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {

        //1
        Comparator<Integer> comparator = (x, y) -> x.compareTo(y);
        System.out.println(comparator.compare(1, 2));
        Comparator<Integer> comparator1 = Integer::compareTo;
        System.out.println(comparator1.compare(1, 2));


        //2
        BiPredicate<String, String> bp = (x, y) -> x.equals(y);
        System.out.println(bp.test("1", "2"));
        BiPredicate<String, String> bp1 = String::equals;
        System.out.println(bp1.test("2", "3"));

        //3
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("1213");
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("2132132");

        //4
        Emp emp = new Emp("上海", "xiaoMIng", 18);
        Supplier<String> supplier = () -> emp.getAddress();
        System.out.println(supplier.get());
        Supplier<String> supplier1 = emp::getAddress;
        System.out.println(supplier1.get());

        //5
        Supplier<Emp> empSupplier = () -> new Emp();
        System.out.println(empSupplier.get());
        Supplier<Emp> empSupplier1 = Emp::new;
        System.out.println(empSupplier1.get());

        //6
        Function<String, Emp> empFunction = x -> new Emp(x);
        System.out.println(empFunction.apply("1"));
        Function<String, Emp> empFunction1 = Emp::new;
        System.out.println(empFunction1.apply("2"));

        //7
        BiFunction<String, Integer, Emp> biFunction = (x, y) -> new Emp(x, y);
        System.out.println(biFunction.apply("1", 1));
        BiFunction<String, Integer, Emp> biFunction1 = Emp::new;
        System.out.println(biFunction1.apply("2", 2));

        //8
        UnaryOperator<Integer> unaryOperator = x -> x + 1;
        unaryOperator.apply(1);

        //9
        BiConsumer<String, Object> biConsumer = App::paint;
        Map<String, Object> map = new HashMap<>();
        map.put("test", "testObject");
        map.forEach(biConsumer);

    }

    public static void paint(String str, Object obj){
        System.out.println(str);
        System.out.println(obj);
    }

    static class Emp {
        private String address;

        private String name;

        private Integer age;

        public Emp() {

        }

        public Emp(String address) {
            this.address = address;
        }

        public Emp(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Emp(String address, String name, Integer age) {
            super();
            this.address = address;
            this.name = name;
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Emp [address=" + address + ", name=" + name + ", age=" + age + "]";
        }

    }

}

