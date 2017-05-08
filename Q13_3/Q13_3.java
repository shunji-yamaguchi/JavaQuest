package Q13_3;

/**
 * List13-8のようなプログラムを動かしていて、
 * method1~method3のどこかでExceptionが投げられているとします。
 * 例外がどのメソッドから投げられているかが、
 * 実行結果で判断できるようにmainメソッドを修正してください。
 * List13-8
 * public class Exception {
 *     public static void main(String[] args) {
 *         try{
 *             method1(0);
 *             method2(0);
 *             method3(0);
 *         } catch(Exception e) {
 *             System.out.println("例外:" + e);
 *         }
 *     }
 *     static void method1(int x)throws Exception {
 *         ...
 *     }
 *     static void method2(int x)throws Exception {
 *         ...
 *     }
 *     static void method3(int x)throws Exception {
 *         ...
 *     }
 * }
 */

public class Q13_3 {
    public static void main(String[] args) {
        try {
            System.out.println("method1の実行");
            method1(0);
            System.out.println("method1の終了");

            System.out.println("method2の実行");
            method2(0);
            System.out.println("method2の終了");

            System.out.println("method3の実行");
            method3(0);
            System.out.println("method3の終了");
        } catch (Exception e) {
            System.out.println("例外:" + e);
        }
    }

    static void method1(int x) throws Exception {

    }

    static void method2(int x) throws Exception {

    }

    static void method3(int x) throws Exception {
        throw new Exception();
    }
}
