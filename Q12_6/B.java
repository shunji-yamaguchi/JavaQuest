package Q12_6;

/**
 * 次のプログラムをコンパイルして、
 *     java B
 * を実行したとき、どのように表示されますか。
 * コンストラクタ呼び出しの順番をよく考えてください。
 *
 * class A {
 *     A() {
 *         System.out.println("1: A()");
 *     }
 *
 *     A(int x) {
 *         System.out.println("2: A(int x)");
 *     }
 * }
 *
 * class B extends A {
 *     B() {
 *         System.out.println("3: B()");
 *     }
 *
 *     B(int x) {
 *         System.out.println("4: B(int x)");
 *     }
 *
 *     B(String s) {
 *         super(789);
 *         System.out.println("5: B(String s)");
 *     }
 *
 *     public static void main(String[] args) {
 *         System.out.println("-----");
 *         new A();
 *         System.out.println("-----");
 *         new B();
 *         System.out.println("-----");
 *         new A(123);
 *         System.out.println("-----");
 *         new B(456);
 *         System.out.println("-----");
 *         new B("test");
 *         System.out.println("-----");
 *     }
 * }
 *
 * (System.out.plintln("-----");)の表示についてはは省略
 * まず、new A();によってクラスAの引数無しのコンストラクタ A()が呼び出され、
 *     1: A()
 * と表示される。
 *
 * 次に、new B();によってクラスBの引数無しのコンストラクタ B()が呼び出されるが、
 * まず、クラスBのスーパークラスであるクラスAの引数無しのコンストラクタ A()が呼び出される。
 * そしてコンストラクタ B()の処理が行われるため、
 *     1: A()
 *     3: B()
 * と表示される。
 *
 *次に、new A(123);によってクラスAのint型を引数としたコンストラクタ A(int x)が呼び出され、
 *    2: A(int x)
 *と表示される。
 *
 *次に、new B(456);によってクラスBのint型を引数としたコンストラクタ B(int x)が呼び出され、
 *まず、クラスBのスーパークラスであるクラスAの引数無しのコンストラクタA()が呼び出される。
 *そして、コンストラクタ B(int x)の処理が行われるため、
 *    1: A()
 *    4: B(int x)
 *と表示される。
 *
 *次に、new B("test");によってクラスBのString型を引数としたコンストラクタ B(String s)が呼び出され、
 *まず、super(789);によってクラスBのスーパークラスであるクラスAの引数がint型のコンストラクタ A(int x)が呼び出される。
 *そして、コンストラクタ B(String s)の処理が行われるため
 *    2: A(int x)
 *    5: B(String s)
 *と表示される。
 */

class B extends A {
    B() {
        System.out.println("3: B()");
    }

    B(int x) {
        System.out.println("4: B(int x)");
    }

    B(String s) {
        super(789);
        System.out.println("5: B(String s)");
    }

    public static void main(String[] args) {
        System.out.println("-----");
        new A();
        System.out.println("-----");
        new B();
        System.out.println("-----");
        new A(123);
        System.out.println("-----");
        new B(456);
        System.out.println("-----");
        new B("test");
        System.out.println("-----");
    }
}
