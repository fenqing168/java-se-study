package cn.fenqing168.prototype;

/**
 * @author fenqing
 */
public class Circle extends Shape {

    public Circle() {
        type = "圆";
    }

    @Override
    void draw() {
        System.out.println("画出了圆");
    }
}
