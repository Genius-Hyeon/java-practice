package kr.or.iei.lambda;

/*	lambda
	1. ���� ���
	- �Լ��� ���α׷���
	- �Լ�: X->Y
	- ���α׷��ֿ����� �Լ�: IO - ����� �޶��� �� �ִ�
	- ���ü�, ���ļ� ó���� ȿ����
	2. ���
	(p1, p2..., pn)-> {
	//�ڵ� ���
 	}
 	�Ķ���ͷ� ������ �Ѱ���
 	�ڵ�� ��ü�� ���� ���󿡼� ���
*/
public class Application {
	public static void main(String[] args) {
		LengthOfTwoStrings l = (String t1, String t2) -> t1.length() + t2.length();
		final int length = l.getLength("abc", "def");
		System.out.println(length);
		System.out.println(l);
		
		final int result = get(10, 100, (a, b) -> {
			if (a>=b) {
				return b;
			}
			return a;
		});
		System.out.println(result);
	}
	
	public static int get(int a, int b, Comparator comparator) {
		return comparator.compare(a, b);
	}
}
