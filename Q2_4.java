//大きな数の計算をやってみようと思ってList2-4を実行したところ、
//1000000000ではなく、1410065408と表示されてしまいました。
//どのように修正したら正しく100000000と表示されるでしょうか。
//List2-4
//public class CalcBig{
//  public static void main(String[] args){
//    System.out.println(10000 * 10000);
//  }
//}

public class Q2_4 {
    public static void main(String[] args) {
        System.out.println("100000 * 100000 = " + (100_000L * 100_000));
    }
}
