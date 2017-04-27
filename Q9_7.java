/**
 * List9-12のプログラムは、
 * 配列dataの要素の中で最も大きい数を表示するものですが、
 * まだ完成していません。
 * これを完成させてください。
 * （最大値を求めるプログラム)
 * List9-12
 * public class ShowMaxData {
 *     public static void main(String[] args) {
 *         int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
 *         int max_data = data[0];
 *         for (int i = 0; i < ???; i++) {
 *
 *             ???
 *
 *         }
 *         System.out.println("最大値は" + max_data + "です。");
 *     }
 * }
 */

public class Q9_7 {
    public static void main(String[] args) {
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        int maxData = data[0];
        for (int i = 1; i < data.length; i++) {

            if (maxData < data[i]) {
                maxData = data[i];
            }

        }
        System.out.println("最大値は" + maxData + "です。");

    }
}
