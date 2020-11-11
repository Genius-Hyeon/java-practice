package kr.or.iei.lambda;

public class Application01 {
	public static void main(String[] args) {
		Lambda01 lambda = (s1, s2) -> 
		s1.length() + s2.length();
		int getLambda = lambda.getLength("abcd", "def");
		System.out.println(getLambda);
	}
}
