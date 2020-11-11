package kr.or.iei.lambda;

public class Application02 {
	public static void main(String[] args) {
		
		Lambda02 lambda02 = (s1, s2) -> s1 + s2;
		final String result = lambda02.getString("고양이", " 귀여워");
		System.out.println(result);
		
		
	}
}
