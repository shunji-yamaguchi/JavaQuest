//例題2のAisatu.javaを修正して、System.out.printlnを一度しか使わずに
//同じ実行結果になるようにしてください。
//Aisatu.java
//pablic class Aisatu{
//  public static void main(String[] args){
//    System.out.println("おはよう。");
//    System.out.println("こんにちは。");
//    System.out.println("こんばんは。");
//  }
//}


public class Q1_4{
    public static void main( String[] args ){
        String str = System.getProperty("line.separator");
        System.out.println("おはよう。" + str + "こんにちは。" + str + "こんばんは。");
        }
    }
