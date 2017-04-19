//ユーザが入力した文字列の文字コードを表示するプログラムを書いてください。


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3_3{
  public static void main(String[] args){
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try{
      System.out.println("文字列を入力してください。");
      String str = reader.readLine();
      for(int i = 0; i < str.length(); i++){
        System.out.println("\"" + str.charAt(i) + "\"の文字コードは" + Integer.toHexString(str.charAt(i)));
      }
      System.out.println("終了");
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
