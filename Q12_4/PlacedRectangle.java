package Q12_4;

/**
 * 次の機能を持つPlacedRectangleを、Rectangleのサブクラスとして宣言してください。
 * ・位置を表すint型のフィールドx,yを持つ
 * ・3つのコンストラクタを持つ
 *     (1)引数無し
 *     (2)位置付き
 *     (3)位置と大きさ付き
 * ・位置を変更するメソッドsetLocationを持つ
 * ・標準的な文字列表現を返すメソッドtoStringを持つ
 *     x = 12, y = 34, width = 123, height = 45のとき、
 *     [(12, 34)[123, 45]]となるものとする。
 * ただし、RectangleクラスはList12-15のように宣言されているとします。
 *
 * List12-15
 * class Rectangle {
 *     int width;
 *     int height;
 *
 *     Rectangle() {
 *         setSize(0, 0);
 *     }
 *
 *     Rectangle(int width, int height) {
 *         setSize(width, height);
 *     }
 *
 *     void setSize(int width, int height) {
 *         this.width = width;
 *         this.height = height;
 *     }
 *
 *     @Override
 *     public String toString() {
 *         return "[" + width + ", " + height + "]";
 *     }
 * }
 */

public class PlacedRectangle extends Rectangle {
    int x;
    int y;

    PlacedRectangle() {
        this(0, 0, 1, 1);
    }

    PlacedRectangle(int x, int y) {
        this(x, y, 1, 1);
    }

    PlacedRectangle(int x, int y, int w, int h) {
        this.setLocation(x, y);
        this.setSize(w, h);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[(" + this.x + ", " + this.y + ") [" + this.width + ", " + this.height + "]]";
    }

    //確認
    public static void main(String[] args) {
        PlacedRectangle rect1 = new PlacedRectangle(10, 15, 13, 11);

        System.out.println(rect1);

    }
}
