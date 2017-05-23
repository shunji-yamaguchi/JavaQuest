package Q12_5;

/**
 * 問題12-4のPlacedRectangleを、
 * Rectangleのサブクラスとしてではなく、
 * Rectangle型のインスタンス変数を持つクラスとして宣言してください。
 */

public class PlacedRectangle {
    Rectangle rectangle = new Rectangle();
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
        rectangle.setSize(w, h);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[(" + this.x + ", " + this.y + ") [" + rectangle.width + ", " + rectangle.height + "]]";
    }

    //確認
    public static void main(String[] args) {
        PlacedRectangle rect1 = new PlacedRectangle(10, 15, 13, 11);

        System.out.println(rect1);

    }
}
