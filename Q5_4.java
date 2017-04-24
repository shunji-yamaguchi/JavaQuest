
/**
 * List5-1のプログラムを修正して、
 * 1なら「オレンジジュースです。」、
 * 2なら「コーヒーです。」、
 * 3なら「ミルクです。」、
 * それ以外なら「どれでもありません。」
 * になるようにしてください。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_4 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str;
            String line_separator = System.lineSeparator();
            int choice = 0;

            System.out.println(
                    "飲み物は何が好きですか？" + line_separator
                            + "1 オレンジジュース" + line_separator
                            + "2 コーヒー" + line_separator
                            + "3 ミルク" + line_separator
                            + "4 どれでもない" + line_separator
                            + "1,2,3,4のどれかを選んでください。");
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
            case 1: {
                str = "オレンジジュースです。";
                break;
            }
            case 2: {
                str = "コーヒーです。";
                break;
            }
            case 3: {
                str = "ミルクです。";
                break;
            }
            default: {
                str = "どれでもありません。";
                break;
            }
            }
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数値の形式が正しくありません。");
        }
    }
}
