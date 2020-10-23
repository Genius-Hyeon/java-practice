import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double Base, Height, Area; 
				
		System.out.print("밑변의 길이를 입력하세요: ");
		Base = scanner.nextDouble();
		System.out.print("높이의 길이를 입력하세요: ");
		Height = scanner.nextDouble();
		
		Area = Base * Height * 0.5;
				
		System.out.print("직각삼각형의 면적은 " + Area  + "입니다.");
	

	}

}
