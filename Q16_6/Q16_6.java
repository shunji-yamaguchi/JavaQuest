package Q16_6;

/**
 * 約3秒ごとに"***"を10回表示するスレッドと、
 * 約5秒ごとに"====="を10回表示するスレッドを、
 * それぞれ１つずつ動かすクラスをThreadクラスの拡張クラスとして作ってください。
 * 表示はFig.16-18のようになります。
 * ***
 * =====
 * ***
 * ***
 * =====
 * ***
 * =====
 * ***
 * =====
 * ***
 * =====
 * ***
 * ***
 * =====
 * ***
 * =====
 * ***
 * =====
 * =====
 * =====
 * =====
*/

public class Q16_6 {
    public static void main(String[] args) {
        PrintEveryThreeSecond p3 = new PrintEveryThreeSecond();
        PrintEveryFiveSecond p5 = new PrintEveryFiveSecond();
        p3.start();
        p5.start();
        
        try {
            p3.join();
            p5.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrintEveryThreeSecond extends Thread {
    private final String str;

    PrintEveryThreeSecond() {
        this.str = "***";
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(3000);
                System.out.println(str);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrintEveryFiveSecond extends Thread {
    private final String str;

    PrintEveryFiveSecond() {
        this.str = "=====";
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000);
                System.out.println(str);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
