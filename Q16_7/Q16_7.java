package Q16_7;

/**.
 * 問題16-6のクラスを、Runnableインタフェースを実装して作ってください。
*/

public class Q16_7 {
    public static void main(String[] args) {

        Runnable p3 = () -> {
            String str = "***";
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(3000);
                    System.out.println(str);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable p5 = () -> {
            String str = "=====";
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(5000);
                    System.out.println(str);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thp3 = new Thread(p3);
        Thread thp5 = new Thread(p5);

        thp3.start();
        thp5.start();

        try {
            thp3.join();
            thp5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
