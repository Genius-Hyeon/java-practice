package exfor;
//형변환
public class Q04 {

	public static void main(String[] args) {
		
		int i = 0;
		double sum = 0;
		for (i = 1; i < 11; i++) 
		{
			sum = sum + (1/(double)i);
		}
		
		System.out.println(sum);
	}

}
