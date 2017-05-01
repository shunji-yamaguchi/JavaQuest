package Q11_7;

/**
 * widthフィールドが123で、heightフィールドが45であるようなRectangleのインスタンスを表示したとき、
 * Rectangle(123, 45)
 * と表示されるようにしたいとします。どのようにプログラミングすればよいですか。
 */

public class Rectangle {
    int width;
    int heitgh;

    Rectangle() {
        this.width = 123;
        this.heitgh = 45;
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + ", " + heitgh + ")";
    }

    public static void main(String[] args) {
        OutputRect rect = new OutputRect();
        System.out.println(rect);
    }
}
