package threadReview;

public class WorkerApplication {

    public static void main(String[] args) {

        // 감시 받을 스레드
        final WorkerThread thread = new WorkerThread();

        // 감시할 스레드
        final Watchdog watchdog = new Watchdog(thread);
        watchdog.start();
    }
}
