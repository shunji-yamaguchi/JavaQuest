
//2人の名前と年齢を入力すると、その人たちの年齢の平均を表示するプログラムを書いてください。

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_2 {

    private static final int MAX_NUMBER_OF_PEOPLE = 2;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int sum = 0;

            for (int count = 0; count < MAX_NUMBER_OF_PEOPLE; count++) {
                System.out.println((count + 1) + "人目の名前を入力してください");
                String name = reader.readLine();
                System.out.println(name + "さんの年齢を入力してください。");
                sum += Integer.parseInt(reader.readLine());
            }
            System.out.println(MAX_NUMBER_OF_PEOPLE + "人の平均年齢は" + ((double) sum / MAX_NUMBER_OF_PEOPLE) + "です。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢が正しくありません");
        }
    }
}
