package cn.fenqing168.prototype;

/**
 * @author fenqing
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "矩形";
    }

    @Override
    void draw() {
        System.out.println("画出了矩形");
    }
}
