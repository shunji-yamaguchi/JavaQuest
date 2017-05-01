package Q11_4;
/**
 * 二次元座標の点を表す次のプログラムをコンパイルしたら、エラーになりました。
 * なぜですか。どう直したらよいですか。
 *
 * 1:class Point {
 * 2:    int x;
 * 3:    int y;
 * 4:    static void setPosition(int x, int y) {
 * 5:        this.x = x;
 * 6:        this.y = y;
 * 7:    }
 * 8:}
 * 1行目、クラス宣言時に他のクラスから参照できるようpublicで宣言していないので、クラス宣言時にpublicを付けます。
 * 5行目、メソッドにstatic修飾子があり、メソッドの外で宣言したフィールドxとyを使えないのでstaticを使いません。
 */

public class Point {
    int x;
    int y;

    void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.setPosition(5, 10);
        System.out.println("x:" + point.x);
        System.out.println("y:" + point.y);
    }
}
