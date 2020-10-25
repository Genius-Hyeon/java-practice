package ex0925;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요 >> " );

		for (int i=0; i<intArray.length; i++)
		{
			intArray[i] = scan.nextInt();// 키보드에서 입력받은 정수 저장
			sum += intArray[i]; // 배열에 저장된 정수 값을 sum에 더하기
		}
		
		double avg = sum / intArray.length; //평균 구하기
		
		System.out.println("평균은 " + avg);
		
		scan.close();
	}
}
