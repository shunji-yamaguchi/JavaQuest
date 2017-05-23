/**
 * List9-13のプログラムは、
 * 配列dataの要素を小さい順に並べ替えるものですが、
 * まだ完成していません。
 * これを完成させてください（ソートプログラム）。
 * ここでいう小さい順とは、
 * data[0] <= data[1] <= data[2] <= ...
 * となることを指します。昇順ともいいます。
 *
 * List9-13
 * public class SortData {
 *     public static void main(String[] args) {
 *         int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
 *         System.out.println("並べ替える前");
 *         for (int i = 0; i< data.length; i++) {
 *             System.out.print(data[i] + " ");
 *         }
 *         System.out.println(" ");
 *         for (int i = 0; i < ???; i++) {
 *             for (int j = i + 1; j < ???; j++) {
 *                 if (data[i] > data[j]) {
 *                     //交換
 *
 *                     ???
 *
 *                 }
 *             }
 *         }
 *         System.out.println("並べ替えた後");
 *         for (int i = 0; i < data.length; i++) {
 *             System.out.print(data[i] + " ");
 *         }
 *         System.out.println(" ");
 *     }
 * }
 */

public class Q9_8 {
    public static void main(String[] args) {
        int[] data = { 31, 41, 59, 26, 53, 58, 97, 93, 23, 84 };
        System.out.println("並べ替える前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    //交換
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
        System.out.println("並べ替えた後");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(" ");
    }
}
