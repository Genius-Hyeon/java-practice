package threadReview;

public class FactorialThreadRun {
    public static void main(String[] args) throws InterruptedException {
        final FactorialThread thread = new FactorialThread();
        thread.start();
        System.out.println("start 후");
        thread.join();
        System.out.println("join 후");
        final long result = thread.getData();
        System.out.println(result);

    }
}
