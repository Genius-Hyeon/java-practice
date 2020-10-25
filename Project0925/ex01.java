package ex0925;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5]; //배열 생성

		int max = 0; //현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요.");
		for (int i = 0; i < intArray.length; i++) 
		{
			System.out.println((i+1) + "번째 양수를 입력하세요.");//안내 문구
			intArray[i] = scan.nextInt();//입력받은 정수를 배열에 저장
			if(intArray[i]>max) 
			{
				max = intArray[i]; //intArray[i]가 현재 가장 큰 수 
			}
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		scan.close();
	}
}