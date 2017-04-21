//光の速度を秒速30万キロメートルとします。このとき、光が一日に進む距離をJava言語で計算し、求めてください。

public class Q3_1 {
    public static void main(String[] args) {
        long kousoku = 300000;

        System.out.println("光が一日に進む距離は" + (kousoku * 24 * 60 * 60) + "キロメートルです。");
    }
}
