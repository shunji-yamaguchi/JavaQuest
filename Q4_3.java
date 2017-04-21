
/**
 * 現在の時刻（時のみ）をキーボードから入力すると、
 * 午前中 -> 「おはようございます」
 * 正午 -> 「お昼です」
 * 午後 -> 「こんにちは」
 * 夜 -> 「こんばんは」
 * と、それぞれ表示するプログラムを書いてください。ただし、
 * 午前中:0時から11時
 * 正午:12時
 * 午後:13時から18時
 * 夜:19時から23時
 * とします。
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4_3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("時刻を入力してください。");
            int time_now = Integer.parseInt(reader.readLine());

            if (time_now < 0 || 23 < time_now) {
                System.out.println("正しい時刻を入力してください");
            } else if (time_now <= 11) {
                System.out.println("おはようございます");
            } else if (time_now <= 12) {
                System.out.println("お昼です");
            } else if (time_now <= 18) {
                System.out.println("こんにちは");
            } else {
                System.out.println("こんばんは");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません");
        }
    }
}
