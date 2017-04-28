/**
 * List9-11のプログラムのうち、???の部分を完成させて、
 * Fig.9-12のような実行結果になるようにしてください。
 *
 * List9-11
 * public class SelectGreeting {
 *     public static void main(String[] args) {
 *         String[] message ???
 *
 *         ???
 *
 *         if (args.length != 1) {
 *             System.out.println("使い方:java SelectGreeting 番号");
 *             System.exit(0);
 *         }
 *         int num = Integer.parseInt( ??? );
 *         if (0 <= num && num < message.length) {
 *             System.out.println(message[num]);
 *         } else {
 *             System.out.println("番号は0～" + ??? + "の範囲で指定してください");
 *         }
 *     }
 * }
 *
 * Fig.9-12 List9-11の実行結果
 * C:\WORK>java SelectGreeting
 * 使い方:java SelectGreeting 番号
 *
 * C:\WORK>java SelectGreeting 0
 * おはよう!
 *
 * C:\WORK>java SelectGreeting 1
 * こんにちは！
 *
 * C:\WORK>java SelectGreeting 2
 * こんばんは！
 *
 * C:\WORK>java SelectGreeting 3
 * 番号は0～2の範囲で指定してください。
 *
 * C:\WORK>java SelectGreeting -100
 * 番号は0～2の範囲で指定してください。
 *
 */

public class SelectGreeting {
    public static void main(String[] args) {
        String[] message = new String[3];

        message[0] = "おはよう！";
        message[1] = "こんにちは！";
        message[2] = "こんばんは！";

        if (args.length != 1) {
            System.out.println("使い方:java SelectGreeting 番号");
            System.exit(1);
        }
        int num = Integer.parseInt(args[0]);
        if (0 <= num && num < message.length) {
            System.out.println(message[num]);
        } else {
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください");
        }
    }
}
