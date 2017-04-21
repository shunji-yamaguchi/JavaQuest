
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
            String greet;
            System.out.println("時刻を入力してください。");
            int time_now = Integer.parseInt(reader.readLine());
            

            if (time_now < 0 || 23 < time_now) {
                greet = "正しい時刻を入力してください";
            } else if (time_now <= 11) {
                greet = "おはようございます";
            } else if (time_now <= 12) {
                greet = "お昼です";
            } else if (time_now <= 18) {
                greet = "こんにちは";
            } else {
                greet = "こんばんは";
            }
            System.out.println(greet);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません");
        }
    }
}
