package threadReview;

public class HelloThread extends Thread{

    public void run() {
        while(true) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {

            }
        }
    }
}
