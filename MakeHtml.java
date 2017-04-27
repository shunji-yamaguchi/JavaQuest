
/**
 * 標準入力から1行ずつ読み取って、
 * 以下のルールにしたがって処理を行い、
 * 標準出力に出すプログラムMakeHtmlを作ってください。
 *
 *・ルール1（開始）：
 *最初に一度だけ、以下の6行を出力する。
 *    <!DOCTYPE html>
 *    <html>
 *    <head>
 *    <title>My Page</title>
 *    </head>
 *    <body>
 *
 *・ルール2（終了）：
 *    標準入力が終わったら、最後に以下の2行を出力する。
 *    </body>
 *    </html>
 *
 *・ルール3（見出し1）：
 *    入力行が"■"で始まっていたら、■を取り除いた残りの文字列を"<h1>"と"</h1>"ではさんで改行付きで出力する。
 *
 *・ルール4（見出し2）：
 *    入力行が"●"で始まっていたら、●を取り除いた残りの文字列を"<h2>"と"</h2>"ではさんで改行付きで出力する。
 *
 *・ルール5（段落）：
 *    入力がルール3にもルール4にも当てはまらないなら、入力行を"<p>"と"</p>"ではさんで改行付きで出力する。
 *
 *このルールにしたがうと、List7-10のようなテキストファイルを、List7-11のようなHTMLファイルに、
 *次のようにして変換することができます。
 *java MakeHtml <hello.txt> hello.html
 *
 *List7-10
 *入力ファイル（hello.txt)
 *1:■私のホームページへようこそ
 *2:●こんにちは
 *3:こんにちは！私のホームページへようこそ。
 *4:●自己紹介
 *5:私は結城浩といいます。どうぞよろしく。
 *
 *List7-11
 *出力ファイル(hello.html)
 * 1:<!DOCTYPE html>
 * 2:<html>
 * 3:<head>
 * 4:<title>My Page</title>
 * 5:</head>
 * 6:<body>
 * 7:<h1>私のホームページへようこそ。</p>
 * 8:<h2>こんにちは</h2>
 * 9:<p>こんにちは！私のホームページへようこそ。</p>
 *10:<h2>自己紹介</h2>
 *11:<p>私は結城浩といいます。どうぞよろしく。</p>
 *12:</body>
 *13:<html>
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeHtml {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));

            System.out.println("<!DOCTYPE html>");
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("<title>My Page</title>");
            System.out.println("</head>");
            System.out.println("<body>");

            String line = null;
            while ((line = reader.readLine()) != null) {

                if (line.startsWith("■")) {
                    System.out.println("<h1>" + line.substring(1, (line.length())) + "</h1>");
                } else if (line.startsWith("●")) {
                    System.out.println("<h2>" + line.substring(1, (line.length())) + "</h2>");
                } else {
                    System.out.println("<p>" + line + "</p>");
                }
            }
            System.out.println("</body>");
            System.out.println("</html>");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
