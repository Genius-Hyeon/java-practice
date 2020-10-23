
public class Q04 {

	public static void main(String[] args) {
		int num1 = 0;

		for(int i = 1; i<=20; i++)
			if (i%2 ==0) {
				num1 += i;
			}

		System.out.println("1에서 20까지의 수 중에 짝수의 합계 : " + num1);
	}

}

