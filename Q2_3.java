/**
 * 上底が2センチ、下底が3センチ、高さが4センチの台形の面積を計算するプログラムを作ってください。
 * @author hironori.ohashi
 *
 */

public class Q2_3 {
    public static void main(String[] args) {
        int width1 = 2;
        int width2 = 3;
        int height = 4;
        System.out.println("上底が" + width1 + "、下底が" + width2
                + "、高さが" + height + "の台形の面積は" + (height * (double) (width1 + width2) / 2));
    }
}
