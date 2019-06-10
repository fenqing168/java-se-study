package cn.fenqing168.bridge;

public class GreenCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("画绿色[半径："
              + radius +", 坐标：(" + x + ", " + y +")]");
   }
}