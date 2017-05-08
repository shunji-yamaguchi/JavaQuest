package Q13_2;

/**
 * List13-3の例外処理をmainメソッドからmyAssignメソッドに移してください。
 * すなわち、mainメソッドにはmyassignメソッドの呼び出しだけを置き、
 * tyr文はmyAssignメソッド中におさめてください。
 * List13-3
 *public classExceptionTest3{
 *     public static void main(String[] args) {
 *         int[] myarray = new int[3];
 *         try{
 *             System.out.println("代入します。");
 *             myAssign(myarray, 100, 0);
 *             System.out.println("代入しました。");
 *         } catch(ArrayIndexOutOfBoundsException) {
 *             System.out.println("代入できませんでした");
 *             System.out.println("例外は" + e + "です");
 *         }
 *         System.out.println("終了します");
 *     }
 *     static void myAssign(int[] arr, int index, int value) {
 *         System.out.println("myAssignに来ました");
 *         arr[index] = value;
 *         System.out.println("myAssignから帰ります");
 *     }
 * }
 */

public class Q13_2 {
    public static void main(String[] args) {
        int[] myarray = new int[3];
        System.out.println("代入します");
        myAssign(myarray, 100, 0);
        System.out.println("代入しました");
        System.out.println("終了します");
    }

    static void myAssign(int[] arr, int index, int value) {
        System.out.println("myAssignに来ました");
        try {
            arr[index] = value;
            System.out.println("myAssignから帰ります");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外は" + e + "です");
        }

    }
}
