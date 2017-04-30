/**
 * 次のような「長方形」クラスを宣言してください。
 * ・クラスの名前はRectangle
 * ・「幅」を表すint型のフィールドwidthを持つ
 * ・「高さ」を表すint型のフィールドheightを持つ
 * ・幅と高さを指定するコンストラクタを持つ
 * ・幅が123で高さが45のときに、
 *     [123, 45]
 *   という文字列を得るためのtoStringメソッドを持つ
 */

public class Rectangle {
    //幅と高さ
    int width;
    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public String toString() {
        return "[" + width + ", " + height + "]";
    }
}
