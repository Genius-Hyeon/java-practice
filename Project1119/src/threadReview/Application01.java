package threadReview;

import java.util.Scanner;

// 블로킹
public class Application01 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("next가 종료되기 전까지 이곳에 못옴.");
    }
}
