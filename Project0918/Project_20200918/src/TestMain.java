import java.util.Scanner;  // 추가 

public class TestMain {
		
	public static void main(String[] args) {

		int num1, kor1, sum1=0, sum2=0; 
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("학생번호 입력 >> ");  
		num1 = scan.nextInt(); 	
		
		System.out.print("1.국어 점수 입력 >> ");  
		sum1 = sum1 + scan.nextInt();
		
		System.out.print("1.수학 점수 입력 >> "); 
		sum1 = sum1 + scan.nextInt();
			
		System.out.print("1.영어 점수 입력 >> "); 
		sum1 = sum1 + scan.nextInt();
					
		System.out.println(num1 +"번호 학생의 점수 합계 "+ sum1);
		
		System.out.print("학생번호 입력 >> ");  
		num1 = scan.nextInt(); 	
		
		System.out.print("2.국어 점수 입력 >> ");  
		sum2 = sum2 + scan.nextInt();
		
		System.out.print("2.수학 점수 입력 >> "); 
		sum2 = sum2 + scan.nextInt();
		
		System.out.print("2.영어 점수 입력 >> "); 
		sum2 = sum2 + scan.nextInt();
		
		System.out.println(num1 + "번호 학생의 점수 합계 "+ (sum2));	
		System.out.println("두 학생의 평균 : " + (sum1+sum2)/6);
	}
}
