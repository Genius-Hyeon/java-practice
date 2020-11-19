package threadReview;

public class ThreadPriority extends Thread {

    public ThreadPriority(String name) {
        setName(name);
    }

    @Override
    public void run() {
        long sum = 0;
        final long t1 = System.currentTimeMillis();
        for (int i=0; i<20_0000_0000; i++) {
            sum += i;
        }
        final long t2 = System.currentTimeMillis();
        System.out.printf("스레드 %s 수행시간: %d\n", getName(), t2-t1);
    }
}
