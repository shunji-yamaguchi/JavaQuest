package Q19_3;

/**
 * 「ArrayListの内部はどうなっているか」(p.269)を参考にして、
 * 以下のようなクラスMyStringArrayListを作ってください。
 * ただし、練習のため、java.utilパッケージは使わないようにしてください。
 *     ・コンストラクタの中でINITIAL_CAPACITY個の要素を持つStringの配列を、
 *       arフィールドに確保する
 *     ・addメソッドで要素を追加する。配列arがいっぱいだったら、
 *       長さを2倍にした新しい配列を確保した上で追加する。
 *     ・getメソッドで要素を参照する。添え字が範囲外なら、
 *       例外IndexOutOfBoundsExceptionをthrowする。
 *     ・sizeメソッドで格納されている要素数(ar.lengthではない)を返す。
 *
 * List19-16
 * public class MyStringArrayList {
 *     private static final int INITIAL_CAPACITY = 4;
 *         private String[] ar;
 *         private int sz;
 *
 *         public MyStringArrayList() {
 *         }
 *
 *         public void add(String s) {
 *         }
 *
 *         public String get(int n) {
 *         }
 *
 *         public int size() {
 *         }
*/

public class MyStringArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private String[] ar;
    private int arraySize;
    private int arrayCount;

    public MyStringArrayList() {
        ar = new String[INITIAL_CAPACITY];
        arraySize = INITIAL_CAPACITY;
        arrayCount = 0;
    }

    public void add(String s) throws OutOfMemoryError {
        if (arrayCount >= arraySize) {
            //配列の増設の処理
            try {
                String[] arTemp = ar;
                ar = new String[arraySize * 2];
                System.arraycopy(arTemp, 0, ar, 0, arrayCount);
                arraySize *= 2;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
            }
        }
        ar[arrayCount] = s;
        arrayCount++;
    }

    public String get(int n) throws IndexOutOfBoundsException {
        if (n < 0 || n > arrayCount) {
            throw new IndexOutOfBoundsException();
        }
        return ar[n];
    }

    public int size() {
        return arrayCount;
    }
}
