package Q18_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**.
 * ファイル中に特定の文字列を含んでいるかどうかを調べるプログラム
 * FindFile1を作ってください。
 * 起動の時の引数は、
 *     java FindFile1 検索文字列 検索対象ファイル
 * のようにして、
 * 文字列が見つかったらその行の行番号と、
 * その行そのものを表示してください。
 * 実行結果はFig.18-14のようになります。上巻p.167のFind1を参考にしてください。
 * ここでは、Systemという文字列をFindFile1.javaというファイルから検索しています。
 *
 * List7-7
 * import java.io.*;
 *
 * public class Find1 {
 *     public static void main(String[] args) {
 *         if (args.length != 1) {
 *             System.out.println("使用方法:java Find1 検索文字列 < 検索対象ファイル");
 *             System.out.println("例:java Find1 System < Find1.java");
 *             System.exit(-1);
 *         }
 *         String findstring = args[0];
 *         System.out.println("検索文字列は「" + findstring + "」です。");
 *         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 *         try {
 *             String line;
 *             int linenum = 1;
 *             while ((line = reader.readLine()) != null) {
 *                 int n = line.indexOf(findstring);
 *                 if (n >= 0) {
 *                     System.out.println("linenum + ":" + line);
 *                 }
 *                 linenum++;
 *             }
 *         } catch (IOException e) {
 *             System.out.println(e);
 *         }
 *     }
 * }
 *
 * Fig.18-14
 * C:\WORK> javac FindFile1.java
 *
 * C:\WORK> java FindFile1 System FindFile1.java
 *  6:        System.out.println("使用方法:java FindFile1 検索文字列 検索対象ファイル");
 *  7:        System.out.println("例:java FindFIle1 System FindFile1.java");
 *  8:        System.exit(-1);
 * 19:                System.out.println(linenum + ":" + line);
 * 25:        System.out.println(filename + "が見つかりません。");
 * 27:        System.out.println(e);
*/

public class FindFile1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用方法:java Find1 検索文字列 検索対象ファイル");
            System.out.println("例:java Find1 System Find1.java");
            System.exit(1);
        }
        String findString = args[0];
        String fileName = args[1];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                if (line.indexOf(findString) != -1) {
                    System.out.println(line);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(fileName + "が見つかりません。");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
