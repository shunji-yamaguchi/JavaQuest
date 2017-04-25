
/**
 * 以下のswitch文をif文で書き換えてください。
 *
 * switch(c) {
 * case '1':
 * case 'a':
 *     System.out.println("オレンジジュースです。");
 *     break;
 * case '2':
 * case 'b':
 *     System.out.println("コーヒーです。");
 *     break;
 * default:
 *     System.out.println("どちらでもありません。");
 *     break;
 * }
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_5 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choice = "0";
            String str;
            System.out.println("好きな飲み物はなんですか？");
            System.out.println("1,a オレンジジュース");
            System.out.println("2,b コーヒー");
            System.out.println("3,c どれでもない");
            System.out.println("1(a),2(b),3(c)のどれかを選んでください");
            choice = reader.readLine();

            if (choice.equals("1") || choice.equals("a")) {
                str = "オレンジジュースです。";
            } else if (choice.equals("2") || choice.equals("b")) {
                str = "コーヒーです。";
            } else {
                str = "どちらでもありません。";
            }

            System.out.println(str);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
