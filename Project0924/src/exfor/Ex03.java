package exfor;
//1부터 50까지 3의 배수의 합계 구하기
public class Ex03 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 3; i < 51; i+=3) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
	}

}
