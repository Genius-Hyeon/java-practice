package exarr;
public class Sample1 {

	public static void main(String[] args) {

		int [] test;
		test = new int[10];
		
		test[0] = 80;
		test[1] = 77;
		test[2] = 66;
		test[3] = 60;
		test[4] = 65;
		test[5] = 90;
		test[6] = 88;
		test[7] = 45;
		test[8] = 59;
		test[9] = 69;
		
		for(int i=0; i<10; i++)
		{
			System.out.println((i+1)+"번째 사람의 점수는 "+ test[i]);
		}
	}

}
