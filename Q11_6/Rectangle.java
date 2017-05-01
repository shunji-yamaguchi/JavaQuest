package Q11_6;

/**
 * ある人が、2つのRectangleのインスタンスの内容が等しいかどうかを調べるメソッドが必要になり、
 * 次のようなメソッドareSameを宣言しました。
 * ところが、プログラミングの先生に見せたところ、
 * 「引数を1つにした方がいい」と言われました。
 * どうすればよかったのでしょう。
 *
 * class Rectangle {
 *     ...
 *     //2つのRectangleを比較して、等しかったらtrue,
 *     //等しくなかったらfalseを返す
 *     boolean areSame(Rectangle a, Rectangle b) {
 *         if (a == null || b == null) {
 *             return false;
 *         } else if (a.width == b.width && a.height == b.height) {
 *             return true;
 *         } else {
 *             return false;
 *         }
 *     }
 * }
 */

class Rectangle {
    int width;
    int height;

    Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    //2つのRectangleを比較して、等しかったらtrue,
    //等しくなかったらfalseを返す
    boolean areSame(Rectangle rect) {
        if (this == null || rect == null) {
            return false;
        } else if (this.width == rect.width && this.height == rect.height) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(10, 20);
        Rectangle b = new Rectangle(10, 20);
        if (a.areSame(b)) {
            System.out.println("大きさは同じ");
        } else {
            System.out.println("大きさは違う");
        }
    }
}
