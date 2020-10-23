package exfor;

public class Q004 {

	public static void main(String[] args) {

		int i = 0;
		int sum = 0;
		
		for (i = 100; i>0; i-=3)
		{
			sum += i;
		}
		
		System.out.println(sum);
	}

}
