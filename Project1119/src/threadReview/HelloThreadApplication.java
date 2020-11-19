package threadReview;

public class HelloThreadApplication {
    public static void main(String[] args) {
        final Thread thread = new HelloThread();
        thread.start();

    }
}
