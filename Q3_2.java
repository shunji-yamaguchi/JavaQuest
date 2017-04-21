
//2人の名前と年齢を入力すると、その人たちの年齢の平均を表示するプログラムを書いてください。

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            double sum = 0;
            int number = 2;

            for (int count = 0; count < number; count++) {
                System.out.println((count + 1) + "人目の名前を入力してください");
                String name = reader.readLine();
                System.out.println(name + "さんの年齢を入力してください。");
                sum += Integer.parseInt(reader.readLine());
            }
            System.out.println(number + "人の平均年齢は" + (sum / number) + "です。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢が正しくありません");
        }
    }
}
