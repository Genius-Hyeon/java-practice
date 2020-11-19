package threadReview;

public class TaskApplication {
    public static void main(String[] args) {
        final Task task = new Task();
        final Thread thread = new Thread(task);
        thread.start();

    }
}
