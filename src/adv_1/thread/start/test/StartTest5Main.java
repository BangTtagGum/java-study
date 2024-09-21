package adv_1.thread.start.test;

import static adv_1.util.MyLogger.log;

public class StartTest5Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new PrintTask("A", 1000));
        Thread thread2 = new Thread(new PrintTask("B", 500));

        thread1.start();
        thread2.start();

    }

    static class PrintTask implements Runnable {

        private String content;
        private int sleepMs;

        public PrintTask(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {

            while (true) {
                log(content);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
