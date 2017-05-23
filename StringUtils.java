import java.util.ArrayList;

/**
 * （JUnit実践入門より）
 * 文字列をスネークケース（すべて小文字で単語区切りがアンダースコア）に変換するユーティリティメソッドのテストを作成せよ。
 * ヒント
 * 設計
 * StringUtilsクラスを定義する
 * StringUtilsクラスにtoSnakeCaseメソッドを定義する
 * toSnakeCaseメソッドは、publicかつstaticメソッドとする
 * toSnakeCaseメソッドは、String型の引数を１つ持ち、戻り値をString型とする
 * テストケース
 * aaaを入力すると、aaaが取得できる
 * HelloWorldを入力すると、hello_worldが取得できる
 * practiceJunitを入力すると、practice_junitが取得できる
*/

public class StringUtils {
    public static String toSnakeCase(String s) {
        int underCount = 0;
        ArrayList<Integer> upperStringIndex = new ArrayList<Integer>();

        //大文字をカウント
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperStringIndex.add(i);
                underCount++;
            }
        }

        if (underCount == 0) {
            return s;
        }

        //大文字の前に"_"を入れる
        StringBuilder str = new StringBuilder(s.length() + underCount);
        int addUnderCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //大文字がまだあるかどうか,"_"を入れるかどうかの判断
            if (addUnderCount < underCount && upperStringIndex.get(addUnderCount) == i) {
                if (i != 0) {//1文字目じゃなかった場合に`_`の追加
                    str.append("_");
                }
                addUnderCount++;
                ch = Character.toLowerCase(ch);
            }
            str.append(ch);
        }
        return str.toString();
    }
}
