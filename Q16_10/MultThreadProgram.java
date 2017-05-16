
/**
 * 次のSingleThreadProgramクラスは、
 * Job(仕事)というクラスのオブジェクトを10個作ってworkというメソッドを呼び続けるものです。
 * 現在は、シングルスレッドのプログラムになっており、
 * 複数の仕事をfor文でぐるぐる順番に実行しています。
 * このプログラムをマルチスレッドに書き換えてください。
 * クラスJobはどこかで宣言されているものとします。
 *
 * List16-14
 * public class SingleThreadProgram {
 *     Job[] jobs;
 *     public SingleThreadProgram(int jobcount) {
 *         jobs = new Job[jobcount];
 *         for (int i = 0; i < jobcount; i++) {
 *             jobs[i] = new job(i);
 *         }
 *     }
 *
 *     public void workAllJobs() {
 *         for (int i = 0; i < jobs.length; i++){
 *             jobs[i].work();
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         SingleThreadProgram self = new SingleThreadProgram(10);
 *         while (true) {
 *             self.workAllJobs();
 *         }
 *     }
 * }
*/

public class MultThreadProgram {
    Job[] jobs;

    public MultThreadProgram(int jobcount) {
        jobs = new Job[jobcount];
        for (int i = 0; i < jobcount; i++) {
            jobs[i] = new Job(i);
        }
    }

    public void workAllJobs() {
        for (Job job : jobs) {
            Runnable runner = job;
            new Thread(runner).start();
        }
    }

    public static void main(String[] args) {
        MultThreadProgram self = new MultThreadProgram(10);
        try {
            while (true) {
                self.workAllJobs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Job implements Runnable {
    String str;

    Job(int i) {
        str = Integer.toString(i);
    }
    public void run() {
        System.out.println("run:" + str);
    }
}
