package cn.fenqing168.prototype;

/**
 * @author fenqing
 */
public class Square extends Shape {

    public Square() {
        type = "正方形";
    }

    @Override
    void draw() {
        System.out.println("画出了正方形");
    }
}
