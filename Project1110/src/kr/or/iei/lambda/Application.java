package kr.or.iei.lambda;

/*	lambda
	1. 등장 배경
	- 함수형 프로그래밍
	- 함수: X->Y
	- 프로그래밍에서의 함수: IO - 결과가 달라질 수 있다
	- 동시성, 병렬성 처리에 효과적
	2. 사용
	(p1, p2..., pn)-> {
	//코드 블록
 	}
 	파라미터로 동작을 넘겨줌
 	코드와 객체를 같은 선상에서 취급
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
