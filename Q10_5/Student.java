/**
 * List10-5とList10-6のプログラムは、
 * 3教科の試験の合計点を学生ごとに表示するものですが、
 * まだ完成していません。
 * ???の部分を完成させて、
 * Fig.10-4のように表示されるようにしてください。
 *
 * List10-5
 * 学生(Student.java)
 * public class Student {
 *     String name;//氏名
 *     int[] tens;//試験の点数
 *     public Student(String name, int x, int y, int z) {
 *
 *         ???
 *
 *     }
 *     @Override
 *     public String toString() {
 *         String s = "[" + name;
 *         for (int i=0; ???; i++) {
 *             s += ???;
 *         }
 *         s += "]";
 *         return s;
 *     }
 *     public int total() {
 *         int sum = 0;
 *         for (int i = 0; ???; i++) {
 *             ???
 *         }
 *         return sum;
 *     }
 * }
 */

public class Student {
    String name; //氏名
    int[] tens; //試験の点数

    public Student(String name, int x, int y, int z) {
        tens = new int[3];
        this.name = name;
        this.tens[0] = x;
        this.tens[1] = y;
        this.tens[2] = z;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[").append(name);
        for (int i = 0; i < tens.length; i++) {
            s.append(", ").append(tens[i]);
        }
        s.append("]");
        return s.toString();
    }

    public int total() {
        int sum = 0;
        for (int i = 0; i < this.tens.length; i++) {
            sum += this.tens[i];
        }
        return sum;
    }
}
