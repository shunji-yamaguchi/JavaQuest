
/**
 * （JUnit実践入門より）
 * Calculatorクラスに整数の割り算を行うdivideメソッドを作成し、
 * 0で割る場合に例外が送出されることを検証するテストを作成せよ。
 * なお、整数の割り算は小数点以下を切り捨ててよい。
 * ヒント
 * 設計
 * Calculatorクラスにdivideメソッドを定義する
 * divideメソッドは、int型の引数を２つ持ち、戻り値をint型とする
 * 戻り値は第１引数を第２引数で割った値とする
 * 第２引数が0である場合、IllegalArgumentExceptionを送出する
 * テストケース
 * 第２引数に0を指定してdivideを呼び出すと、IllegalArgumentExceptionが発生する
*/



class Calculator {
    int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return a/b;
    }
}

