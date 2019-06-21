package cn.fenqing168.lambda;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        //测试类型声明
        Test01 test011 = (int a, int b) -> a + b;
        System.out.println(test011.calculate(1, 2));
        //测试不类型声明
        Test01 test012 = (a, b) -> a - b;
        System.out.println(test012.calculate(2, 1));
        //显示返回语句,必须写大括号
        Test01 test013 = (int a, int b) -> {return a * b;};
        System.out.println(test013.calculate(1, 2));
        //没有大括号
        Test01 test014 = (a, b) -> a / b;
        System.out.println(test014.calculate(5, 2));

        Test01 test015 = (a, b) -> {
            int num = a + b;
            System.out.println(a);
            return a;
        };

        StringBuffer sb = new StringBuffer();
        Test01 test016 = (x, y)->{
            sb.append('z');
            return 0;
        };

        System.out.println(test016.calculate(1, 4));
        System.out.println(sb);

    }

}
