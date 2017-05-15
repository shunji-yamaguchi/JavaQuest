
/**
 * List16-6のGoodBankTestは、
 * GoodBankのインスタンスを生成して、
 * 預金の預け入れと引き出しを行いました。
 * これを変更して銀行口座がたった1つしかないプログラムにしてください。
 * クラスの名前はOneBankTestとOneBankにすること。
 * ヒント:OneBankのフィールドやメソッドをstaticにします。
 *        それに合わせてOneBankTestを作成してください。
 *
 * List16-5
 * public class GoodBank {
 *     private int value = 0;
 *
 *     public synchronized void addMoney(int money) {
 *         int currentValue = value;
 *         System.out.println(Thread.currentThread() + "がaddMoneyに入りました。");
 *         value += money;
 *         if (currentValue + money != value) {
 *             System.out.println(Thread.currentThread() + "で矛盾が発生しました。");
 *             System.exit(-1);
 *         }
 *
 *         System.out.println(Thread.currentThread() + "がaddMoneyから出ました。");
 *     }
 * }
 *
 * List16-6
 * public class GoodBankTest extends Thread {
 *     GoodBank bank;
 *     public GoodBankTest(GoodBank bank) {
 *         this.bank = bank;
 *     }
 *
 *     @Override
 *     public void run() {
 *         while(true) {
 *             bank.addMoney(100);
 *             bank.addMoney(-100);
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         GoodBank bank = new GoodBank();
 *         new GoodBankTest(bank).start();
 *         new GoodBankTest(bank).start();
 *     }
 * }
*/

class OneBank {
    private static int value = 0;

    public static synchronized void addMoney(int money) {
        int currentValue = value;
        System.out.println(Thread.currentThread() + "がaddMoneyに入りました。");
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました。");
            System.exit(-1);
        }

        System.out.println(Thread.currentThread() + "がaddMoneyから出ました。");
    }
}

public class OneBankTest extends Thread {
    public OneBankTest() {
    }

    @Override
    public void run() {
        while (true) {
            OneBank.addMoney(100);
            OneBank.addMoney(-100);
        }
    }

    public static void main(String[] args) {
        new OneBankTest().start();
        new OneBankTest().start();
    }
}
