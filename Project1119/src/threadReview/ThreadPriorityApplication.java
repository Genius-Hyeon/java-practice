package threadReview;

public class ThreadPriorityApplication {
    public static void main(String[] args) {

        for(int i=0; i<10; i++) {
            Thread thread = new ThreadPriority("Thread-" + (i+1));
            if (i==9) {
                thread.setPriority(Thread.MAX_PRIORITY);
            } else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            thread.start();
        }

    }
}
