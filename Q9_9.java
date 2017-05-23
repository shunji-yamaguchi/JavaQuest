/**
 * int型の二次元配列の内容を表示するメソッドprintArrayをList9-14のように作ろうとしていますが、
 * まだできていません。
 * これを完成させてください。
 *
 * List9-14
 * public class PrintArray {
 *     public static void main(String[] args) {
 *         int[][] arr = {
 *             { 3, 1, 4, 1, },
 *             { 5, 9, 2, },
 *             { 6, 5, },
 *             { 3, },
 *         };
 *         printArray(arr);
 *     }
 *     public static void printArray( ??? ) {
 *         System.out.println("{");
 *         for (int i = 0; ???; i++) {
 *             System.out.print(???);
 *             for (int j = 0; ???; j++) {
 *                 System.out.print(???);
 *             }
 *             System.out.println(???);
 *         }
 *         System.out.println("}");
 *     }
 * }
 */

public class Q9_9 {
    public static void main(String[] args) {
        int[][] arr = {
                { 3, 1, 4, 1, },
                { 5, 9, 2, },
                { 6, 5, },
                { 3, },
        };
        printArray(arr);
    }

    public static void printArray(int[][] array) {
        System.out.println("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("    { ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }
}
