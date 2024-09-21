package adv_1.thread.start.test;

import static adv_1.util.MyLogger.log;

public class StartTest1Main {

    public static void main(String[] args) {
        CounterThread counter = new CounterThread();
        counter.start();
    }

    public static class CounterThread extends Thread {

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
    }

}
