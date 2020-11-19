package threadReview;

public class FactorialThread extends Thread {

    private long data = 1;
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {

        }
        for (int i=1; i<=20; i++) {
            data *= i;
        }

    }

    public long getData() {
        return data;
    }
}
