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
        int anderCount = 0;
        ArrayList<Integer> upperString = new ArrayList<Integer>();

        //1文字目を除く大文字をカウント
        for (int i = 1; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperString.add(i);
                anderCount++;
            }
        }

        //大文字の前に"_"を入れる
        StringBuilder str = new StringBuilder(s.length() + anderCount);
        int addAnderCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (addAnderCount < anderCount) { //大文字がまだあるかどうかの判断
                if (upperString.get(addAnderCount) == i) { //"_"を入れるかどうかの判断
                    str.append("_");
                    addAnderCount++;
                }
            }
            str.append(s.substring(i, i + 1));//文字を一文字ずつ追加
        }

        return str.toString().toLowerCase();

    }
}
