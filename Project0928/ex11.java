package stu.exmethod;
import java.util.Scanner;
//히스토그램
public class ex11 {

	public static void main(String[] args) {
		int[] freq = new int[10];

		for (int i=0; i<10; i++) {
			System.out.println("점수를 입력하시오 ");
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			if (s != 0)
				freq[(s-1)/10]++;
			else
				freq[0]++;
			scan.close();
		}
		for (int i=0; i<10; i++) {
			System.out.print((i*10+1)+"-"+(i+1)*10+": ");
			for (int k=0; k<freq[i]; k++)
				System.out.print("*");
			System.out.println("");

		}
	}

}