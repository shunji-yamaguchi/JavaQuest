/**
 * List10-5とList10-6のプログラムは、
 * 3教科の試験の合計点を学生ごとに表示するものですが、
 * まだ完成していません。
 * ???の部分を完成させて、
 * Fig.10-4のように表示されるようにしてください。
 *
 * List10-5
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
 *
 * List10-6
 * public class StudentTest {
 *     public static void main(String[] args) {
 *         Student[] data = {
 *             new Student("結城浩", 65, 90, 100),
 *             new Student("阿部和馬", 82, 73, 64),
 *             new Student("伊藤光一", 74, 31, 42),
 *             new Student("佐藤太郎", 100, 95, 99),
 *         };
 *         for (int i = 0; i < data.length; i++) {
 *             System.out.println(data[i] + "\t-> " + data[i].total());
 *         }
 *     }
 * }
 *
 * Fig.10-4
 * C:\WORK>javac StudentTest.java Student.java
 * C:\WORK>java StudentTest
 * [結城浩, 65, 90, 100]   -> 255
 * [阿部和馬, 82, 73, 64]  -> 219
 * [伊藤光一, 74, 31, 42] -> 147
 * [佐藤太郎, 100, 95, 99] -> 294
 */

public class StudentTest {
    public static void main(String[] args) {
        Student[] data = {
                new Student("結城浩", 65, 90, 100),
                new Student("阿部和馬", 82, 73, 64),
                new Student("伊藤光一", 74, 31, 42),
                new Student("佐藤太郎", 100, 95, 99),
        };
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + "\t-> " + data[i].total());
        }
    }
}
