package Q13_4;
/**
 * 10の階乗を求めるつもりで、List13-9のFactorialTestを動かしたところ、
 * Fig13-13のようにStackOverFlowErrorという例外が投げられました。どうしてでしょうか。
 * また、このプロおグラムをどう直したら10の階乗が求められるでしょうか。
 * なお、10の階乗とは、
 *     10×9×8×7×6×5×4×3×2×1
 * のことです。
 *
 * List13-9
 * public class FactorialTest {
 *     public static void main(String[] args) {
 *         System.out.println(factorial(10));
 *     }
 *     public static int factorial(int n) {
 *         return n * factorial(n - 1);
 *     }
 * }
 * スタック領域がなくなるまで再帰処理を行ったから。
 */

public class Q13_4 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n) {
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
