package Q11_5;
/**
 * ゲームのプレイヤーを表すクラスGamePlayerを作り始めました。
 * とりあえずプレイヤーの名前がつくようになったので、試しに動かしてみました。
 * ところが、
 * [player:Mad Hatter]
 * [player:March Hare]
 * [player:Alice]
 * と3人別々の名前が出ると思っていたのに、
 * Fig.11-8のように、3人とも
 * [player:Alice]という名前になっています。
 * なぜでしょうか。どう直せばいいですか。
 *
 * GamePlayer.java
 *  1:public class GamePlayer {
 *  2:    public static String playername;
 *  3:    public GamePlayer(String name) {
 *  4:        playername = name;
 *  5:    }
 *  6:    @Override
 *  7:    public String toString() {
 *  8:        return "[player:" + playername + "]";
 *  9:    }
 * 10:    public static void main(String[] args) {
 * 11:        GamePlayer[] player = new GamePlayer[3];
 * 12:        player[0] = new GamePlayer("Mad Hatter");
 * 13:        player[1] = new GamePlayer("March Hare");
 * 14:        player[2] = new GamePlayer("Alice");
 * 15:        for (int i = 0; i < player.length; i++) {
 * 16:            System.out.println(player[i]);
 * 17:        }
 * 18:    }
 * 19:}
 *
 * Fig.11-8
 * [player:Alice]
 * [player:Alice]
 * [player:Alice]
 *
 * 2行目、playername宣言時にstatic修飾子が付いているのでクラス変数として宣言されています。
 * なのでstaticを消してインスタンス変数として宣言するようにします。
 */

public class GamePlayer {
    public String playername;

    public GamePlayer(String name) {
        playername = name;
    }

    @Override
    public String toString() {
        return "[player:" + playername + "]";
    }

    public static void main(String[] args) {
        GamePlayer[] player = new GamePlayer[3];
        player[0] = new GamePlayer("Mad Hatter");
        player[1] = new GamePlayer("March Hare");
        player[2] = new GamePlayer("Alice");
        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i]);
        }
    }
}
