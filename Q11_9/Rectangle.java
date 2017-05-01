package Q11_9;

/**
 * 本文中で宣言したRectangleクラスは、
 * 幅と高さを持つ長方形でした。
 * これに「左上すみの位置」を表すxとyというフィールドを追加してください。
 * そして、以下のコンストラクタやメソッドを宣言してください。
 * (1)フィールド
 *    (1a)指定がない時の幅と高さ(INITIAL_WIDTH, INITIAL_HEIGHT)
 * (2)コンストラクタ
 *    (2a)引数がないもの(width, heightの初期値はINITIAL_WIDTH, INITIAL_HEIGHT, xとyは0)
 *    (2b)width, heightだけを指定したもの(xとyは0)
 *    (2c)x, y, width, heightを指定したもの
 * (3)メソッド
 *    (3a)位置を指定するvoid setLocation(int x, int y)メソッド
 *    (3b)大きさを指定するvoid setSize(int width, int height)メソッド
 *    (3c)[x, y, width, height]の形式で文字列として表現するtoStringメソッド
 *    (3d)長方形の「重なり部分」(これも長方形)を得るintersect(Rectangle r)メソッド。
 *        ただし、重なりがない場合にはnullを返す
 */

class Rectangle {
    public int width;
    public int height;
    public int x;
    public int y;

    static int INITIAL_WIDTH = 10;
    static int INITIAL_HEIGHT = 10;

    Rectangle() {
        this.width = INITIAL_WIDTH;
        this.height = INITIAL_HEIGHT;
        this.x = 0;
        this.y = 0;
    }

    Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
        this.x = 0;
        this.y = 0;
    }

    Rectangle(int w, int h, int x, int y) {
        this.width = w;
        this.height = h;
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "[" + this.x + ", " + this.y + ", " + this.width + ", " + this.height + "]";
    }

    public Rectangle intersect(Rectangle r) {
        //返す矩形の左上のx座標
        int x1 = this.x > r.x ? this.x : r.x;
        //返す矩形の左上のy座標
        int y1 = this.y > r.y ? this.y : r.y;
        //返す矩形の右下のx座標
        int x2 = (this.x + this.width) < (r.x + r.width) ? (this.x + this.width) : (r.x + r.width);
        //返す矩形の右下のy座標
        int y2 = (this.y + this.height) < (r.y + r.height) ? (this.y + this.height) : (r.y + r.height);

        if (x2 <= x1 || y2 <= y1) {
            return null;
        }
        int w = x2 - x1;
        int h = y2 - y1;
        Rectangle rect = new Rectangle(w, h, x1, y1);
        return rect;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(20, 20, 0, 0);
        Rectangle rect2 = new Rectangle(15, 15, 15, 15);
        Rectangle rect3 = new Rectangle();
        rect3 = rect1.intersect(rect2);

        System.out.println(rect3);
    }
}
