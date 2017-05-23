/**
 * 上底が2センチ、下底が3センチ、高さが4センチの台形の面積を計算するプログラムを作ってください。
 * @author hironori.ohashi
 *
 */

public class Q2_3 {
    public static void main(String[] args) {
        double width1 = 2;
        double width2 = 3;
        double height = 4;
        double ans = (width1 + width2) * height / 2;
        System.out.println("上底が" + width1 + "センチ、下底が" + width2
                + "センチ、高さが" + height + "センチの台形の面積は" + ans + "平方センチです。");
    }
}
