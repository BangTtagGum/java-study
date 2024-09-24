package adv_1.thread.control;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() /*throws Exception*/ { // 주석 풀면 예외 발생
            //throw new Exception(); // 주석 풀면 예외 발생
//            throw new RuntimeException(); // 런타임 에러는 예외 처리가 강제되지 않기 때문에 던질 수 있다.
        }
    }
}
