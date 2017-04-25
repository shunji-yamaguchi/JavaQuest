
/**
 * List7-12は何をするプログラムですか。
 * また、continue文を使わない形式に書き換えてください。
 *
 *
 * List7-12 入力された文字列の最後が "{"又は"}"だった場合、入力された文字列を出力するプログラム。
 * import java.io.*;
 *
 * public class ContinueTest {
 *     public static void main(String[] args) {
 *         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in());
 *         try {
 *             String line;
 *             while((line = read.readLine()) != null) {
 *                 if(!line.endsWith("{") && !line.endsWith("}")) {
 *                     continue;
 *                 }
 *                 System.out.println(line);
 *             }
 *         } catch (IOException e) {
 *             System.out.println(e);
 *         }
 *     }
 * }
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("{") || line.endsWith("}")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
