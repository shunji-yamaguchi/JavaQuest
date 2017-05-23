import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void toSnakeCaseにaaaを渡すとaaaが得られること() {
        assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
    }

    @Test
    public void toSnakeCaseにHelloWorldを渡すとhello_worldが得られること() {
        assertThat(StringUtils.toSnakeCase("HelloWorld"), is("hello_world"));
    }

    @Test
    public void toSnakeCaseにprecticeJunitを渡すとprectise_junitが得られること() {
        assertThat(StringUtils.toSnakeCase("precticeJunit"), is("prectice_junit"));
    }

    @Test
    public void toSnakeCaseに空文字を渡すと空文字が返ってくる() {
        assertThat(StringUtils.toSnakeCase(""), is(""));
    }
}
