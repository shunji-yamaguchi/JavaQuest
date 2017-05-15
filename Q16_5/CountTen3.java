package Q16_5;

/**
 * List16-1(CountTenA.java)では、runメソッドを実行しているのは1つのスレッドでした。
 * 新たなスレッドを1つだけ生成するのではなく、
 * ３個生成して動作するようにプログラムを書き換えてください。
 * クラスの名前はCountTen3とします。
 * その際、java.lang.Threadクラスには、
 * 自分のスレッドの名前を得る次のメソッドがあります。
 * これを利用して表示を行っているのがどのスレッドであるか分かるようにしてみましょう。
 *     public final String getName()
 * 必要なら、現在のスレッドを得る以下のスレッドも利用してください。
 *     public static Thread currentThread()
 *
 * List16-1
 * public class CoutnTenA extends Thread {
 *     public static void main(String[] args) {
 *         CountTenA ct = new CountTenA();
 *         ct.start();
 *         for (int i = 0; i < 10; i++){
 *             System.out.println("main:i" + i);
 *         }
 *     }
 *
 *     @Override
 *     public void run() {
 *         for (int i = 0; i < 10; i++) {
 *             System.out.println("run:i" + i);
 *         }
 *     }
 * }
*/

public class CountTen3 extends Thread {
    public static void main(String[] args) {
        CountTen3 ct1 = new CountTen3();
        CountTen3 ct2 = new CountTen3();
        CountTen3 ct3 = new CountTen3();

        ct1.start();
        ct2.start();
        ct3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + ":i" + i);
        }

        try {
            ct1.join();
            ct2.join();
            ct3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + ":i" + i);
        }
    }
}
