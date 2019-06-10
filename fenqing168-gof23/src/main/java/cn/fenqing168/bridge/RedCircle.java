package cn.fenqing168.bridge;

/**
 * @author fenqing
 */
public class RedCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("画红色[半径："
         + radius +", 坐标：(" + x + ", " + y +")]");
   }
}