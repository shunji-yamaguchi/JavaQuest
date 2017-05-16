package Q18_3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * List18-9は、
 * ファイルの名前を指定すると、
 * そのファイルに1000より小さい素数の表を書き出すプログラムですが、
 * まだ作りかけです。
 *     java Prime1 prime.txt
 * のように実行すると、
 * prime.txtの内容はFig.18-15のようになる予定です。
 * このプログラムを完成させてください。
 * List18-9
 * public class Prime1 {
 *     public static void main(String[] args) {
 *         if(args.length != 1) {
 *             System.out.println("使用方法：java Prime1 作成ファイル");
 *             System.out.println("例:java Prime1 prime.txt");
 *             System.exit(1);
 *         }
 *         String filename = args[0];
 *
 *         PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
 *         writePrime(writer);
 *         writer.close();
 *     }
 *
 *     public static void writePrime(PrintWriter writer) {
 *         boolean[] prime = new boolean[MAX_PRIME];
 *         for (int n = 0; n < MAX_PRIME; n++) {
 *             prime[n] = true;
 *         }
 *         prime[0] = false;
 *         prime[1] = false;
 *         for (int n = 0; n < MAX_PRIME; n++) {
 *             prime[n] = true;
 *         }
 *         prime[0] = false;
 *         prime[1] = false;
 *         for (int n = 0; n < MAX_PRIME; n++) {
 *             if (prime[n]) {
 *                 //ここでnを出力する
 *                 for (int i = 2; i * n < MAX_PRIME; i++) {
 *                     prime[i * n] = false;
 *                 }
 *             }
 *         }
 *     }
 * }
 *
 * Fig.18-15
 * 2
 * 3
 * 5
 * 7
 * 11
 * 13
 * 17
 * 19
 * 23
 * ・・・（中略）・・・
 * 947
 * 953
 * 967
 * 971
 * 977
 * 983
 * 991
 * 997
 *
*/

public class Prime1 {
    static final int MAX_PRIME = 1000;
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用方法：java Prime1 作成ファイル");
            System.out.println("例:java Prime1 prime.txt");
            System.exit(1);
        }
        String filename = args[0];
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            writePrime(writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writePrime(PrintWriter writer) {
        boolean[] prime = new boolean[MAX_PRIME];
        for (int n = 0; n < MAX_PRIME; n++) {
            prime[n] = true;
        }
        prime[0] = false;
        prime[1] = false;
        
        for (int n = 0; n < MAX_PRIME; n++) {
            if (prime[n]) {
                //ここでnを出力する
                for (int i = 2; i * n < MAX_PRIME; i++) {
                    prime[i * n] = false;
                }
            }
        }
        
        for (int n = 0; n < MAX_PRIME; n++) {
            if(prime[n]) {
                writer.println(n);
            }
        }
    }
}
