package ex0925;

public class ex_easy {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 13;
		int max = a;
		
		if (b > a) max = b;
		if (c > max) max = c;
		
		System.out.println("최대값은 " + max + "입니다");
		
	}

}
