package Q16_2;

/**.
 * 「こんにちは！」というあいさつを1秒おきに表示するPrintHelloクラスと、
 * それを実現するスレッドとなるLabelPrinterクラスを、
 * List16-12のようにして作ろうとしています。
 * まだ誤りがあるので、実行結果がFig.16-17になるように修正してください。
 *
 * List16-12
 * class LabelPrinter {
 *     String label = "no label";
 *     LabelPrinter(String label) {
 *         this.label = label;
 *     }
 *
 *     @Override
 *     public static void run() {
 *         while (true) {
 *             System.out.println(label);
 *             Thread.sleep(1000);
 *         }
 *     }
 * }
 *
 * public class PrintHello {
 *     public static void main(String[] args) {
 *         LabelPrinter th = new LabelPrinter("こんにちは！");
 *         th.start();
 *     }
 * }
 *
 * Fig.16-17
 * こんにちは！
 * こんにちは！
 * こんにちは！
 * ...
 * ※Ctrl + Cで止める
*/

class LabelPrinter extends Thread {
    String label = "no label";

    LabelPrinter(String label) {
        this.label = label;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(label);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PrintHello {
    public static void main(String[] args) {
        LabelPrinter th = new LabelPrinter("こんにちは!");
        th.start();
    }
}
