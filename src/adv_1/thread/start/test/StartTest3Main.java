package adv_1.thread.start.test;

import static adv_1.util.MyLogger.log;

import adv_1.thread.start.test.StartTest2Main.CounterRunnable;

public class StartTest3Main {

    public static void main(String[] args) {

        Thread counter = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    log("value: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, "counter");
        counter.start();
    }
}
