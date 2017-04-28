/**
 * メソッドgetYourNameを呼び出して、
 * "結城"と"浩"という2つの文字列（String）を得たいと思いました。
 * でも、returnには１つしか式が書けませんので、
 * 2つのStringを戻り値にするわけにはいきません。
 * そこで、引数に代入して返そうと思いました。
 * このメソッドはうまく動作するでしょうか。
 * 動作しない場合、どうしたら2つの文字列を返すことができるでしょうか。
 * 以下のList8-6を参考にして答えてください。
 * List8-6
 * public class MethodTest {
 *     /*"結城"と"浩"の2つの文字列を返すメソッド(?)* /
 *     public static void getYourName(String myoji, String name) {
 *         myoji = "結城";
 *         name = "浩";
 *     }
 *     public static void main(String[] args){
 *         String x;
 *         String y;
 *         getYourName(x,y);
 *         System.out.println("名字は" + x);
 *         System.out.println("名前は" + y);
 *     }
 * }
 */

public class Q8_5 {
    public static void getYourName(StringBuilder myoji, StringBuilder name) {
        myoji.append("結城");
        name.append("浩");
    }

    public static void main(String[] args) {
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        getYourName(x, y);
        System.out.println("名字は" + x);
        System.out.println("名前は" + y);
    }
}
