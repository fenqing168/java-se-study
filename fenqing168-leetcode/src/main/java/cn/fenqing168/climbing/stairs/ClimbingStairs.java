package cn.fenqing168.climbing.stairs;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * @author fenqing
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        return climbStairs(0, n);
    }

    public int climbStairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        int num = climbStairs(i + 1, n);
        int num2 = climbStairs(i + 2, n);

        return num + num2;
    }

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(2));
    }

}
