import java.util.Scanner;
/*
 * 세 명의 학생의 이름과 성적을 입력받은 후 "프로그램이 종료되었습니다. " 
 * 라는 메시지를 출력하는 프로그램을 클래스를 활용하여 작성하시오.
 */
class Student {

		String[] name = new String[3];
		int[] score = new int[3];
		int i = 0;

		Scanner scan = new Scanner(System.in);  

		void run() { //입력, 출력 실행 메소드
			input();
			output();
		}

		void input() { //학생 이름, 성적 입력받는 클래스 

			for(int i=0; i<name.length; i++) {
				System.out.println((i+1) + "번째 학생의 이름을 입력하세요: ");
				name[i] = scan.next();
				System.out.println("학생의 성적을 입력하세요: ");
				score[i] = scan.nextInt();
			}
		}
		void print() { // 학생 이름, 성적 출력하는 클래스
				System.out.println((i+1)+"번째 학생 이름: " + name[i]);
				System.out.println((i+1)+"번째 학생 성적: " + score[i] +"점");
				System.out.println("--------------------"); 
				i++;
			}
		void output() { // 프로그램 종료 메시지 출력
			System.out.println("프로그램이 종료되었습니다. ");
		}
	}
	public class Pro09_2 {
		public static void main(String[] args) {

			Student std = new Student();
			std.run(); //main 메소드 간소화

		}
	}
