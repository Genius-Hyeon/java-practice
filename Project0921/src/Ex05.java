import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("실습 전 과제 점수: ");
		int preLabScore = scanner.nextInt();
		System.out.print("실습 과제 점수: ");
		int labScore = scanner.nextInt();
		System.out.print("실습 후 과제 점수: ");
		int postLabcore = scanner.nextInt();
		
		double finalLabScore = (preLabScore/20+postLabcore/30)*30
				+ (labScore/25)*40;
		
		System.out.println("실습 전 과제 점수: " + preLabScore + ", 실습 과제 점수: " + labScore + 
				", 실습 후 과제 점수: " + postLabcore + ", 최종 과제 점수: " + finalLabScore);
				

	}

}
