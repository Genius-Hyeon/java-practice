package kr.or.iei.lambda;

public class Application02 {
	public static void main(String[] args) {
		
		Lambda02 lambda02 = (s1, s2) -> s1 + s2;
		final String result = lambda02.getString("�����", " �Ϳ���");
		System.out.println(result);
		
		
	}
}
