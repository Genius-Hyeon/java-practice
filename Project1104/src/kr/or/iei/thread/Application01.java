package kr.or.iei.thread;

import java.util.Scanner;

public class Application01 {
	public static void main(String[] args) {
		final BeepThread thread = new BeepThread();
		thread.start();
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			final int valueFromKeyboard = scan.nextInt();
			System.out.println("main: " + valueFromKeyboard);
			
		}
	}
}	
