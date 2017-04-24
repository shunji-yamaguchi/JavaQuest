
/**
 * はじめに、「0-6の数字を入力してください。対応した曜日を表示します。」
 * と表示し、キーボードから0-6の数字を入力すると、
 * その数字に応じて「日曜日」「月曜日」・・・「土曜日」
 * と表示して終了するプログラムを作ってください。
 * 0-6以外の数字の入力があった場合には、「0-6の範囲で入力してください」
 * と表示して終了するとします、また、数字以外の入力があった場合には
 * 「数字を入力してください」
 * と表示して終了するとします。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_7 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("0-6の数字を入力してください。対応した曜日を表示します。");

            switch (Integer.parseInt(reader.readLine())) {
            case 0:
                System.out.println("日曜日");
                break;
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            case 6:
                System.out.println("土曜日");
                break;
            default:
                System.out.println("0-6の範囲で入力してください");
                break;
            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください");
        }
    }
}
