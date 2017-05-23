package Q16_3;

/**.
 * 前回の回答のLabelPrinterを使って、
 * 「おはよう！」
 * 「こんにちは！」
 * 「こんばんは！」
 * をそれぞれ表示するスレッド3つを動かすクラスPrintHello3を宣言してください。
 */

class LabelPrinter extends Thread {
    String label = "no label";

    LabelPrinter(String label) {
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(label);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PrintHello3 {
    public static void main(String[] args) {
        LabelPrinter th1 = new LabelPrinter("おはよう!");
        LabelPrinter th2 = new LabelPrinter("こんにちは!");
        LabelPrinter th3 = new LabelPrinter("こんばんは!");
        th1.start();
        th2.start();
        th3.start();
    }
}
