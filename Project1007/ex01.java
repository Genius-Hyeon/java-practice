package ex1007;

public class ex01 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i=1; i<101; i++) {
			sum = sum + i;
			if (i %10 == 0)
				System.out.println("1부터 " + i + "까지의 합: " + sum);
			
		}

	}

}
