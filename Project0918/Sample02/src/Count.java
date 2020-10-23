import java.util.Scanner; //추가

public class Count {

	public static void main(String[] args) {
		int a , b ;
		a = 10;
		b = 3;
		Scanner scan = new Scanner(System.in);//추가
		
		
		System.out.print("a값 입력: ");//추가
		a = scan.nextInt();//추가
		System.out.print("b값 입력: ");//추가
		b = scan.nextInt();//추가
		
		System.out.println(a + "," +b);
		System.out.println(a+b);		
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
}
				
			