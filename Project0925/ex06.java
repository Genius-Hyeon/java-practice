package ex0925;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		//int[] arr = new int[10];
		int max = 0;
		int min = 101;
		//int min = arr[0];
		
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[10];
		System.out.println(arr.length + "개의 양수 입력(100 이하) >> ");

		for(int i = 0; i < arr.length; i++)
		{
			System.out.print((i+1) + "번째 양수를 입력하세요. ");//안내 문구
			arr[i] = scan.nextInt();//양수 입력받기
			if(arr[i] > max)
			{
				max = arr[i];//최대값 구하기
			}
			
			if(arr[i] < min)
			{
				min = arr[i];
			}

		}
		System.out.println("최대값은 " + max + "입니다.");
		System.out.println("최소값은 " + min + "입니다.");
		
		scan.close();
	}


}
