package adv_1.thread.control.yield;


import static adv_1.util.MyLogger.log;
import static adv_1.util.ThreadUtils.sleep;

public class YieldMain {

    static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
//                log(" - " + i);
                System.out.println(Thread.currentThread().getName() + " - " + i);
//                 1. empty
//                sledep(1); // 2. sleep
//                Thread.yield(); // d3. yield
            }
        }
    }
}
