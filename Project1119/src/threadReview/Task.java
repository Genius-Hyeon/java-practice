package threadReview;
/*
* 스레드의 생성자로 넘어감(passing)
* */

public class Task implements Runnable {

    /*
    * 스레드가 수행할 작업 기술
    * */
    @Override
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
