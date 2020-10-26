package stu.exmethod;
//public class 안에 쓰는 것과 비교해서 포스팅하기
class Test{
	//멤버필드
	String[] str = new String[3];

	public Test() { //생성자
		str[0] = "Hello";
		str[1] = "Java";
		str[2] = "World";
		print();
	}

	void print() { //출력
		for (int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
public class ex10 {

	public static void main(String[] args) {
		/*
		 * 1. 멤버필드: greeting
		 * 2. 생성자: 초기화 greeting[0] = "Hello";
		 * 3. 메소드: for문으로 출력
		 */
		new Test();

		/*
		 * Test test = new Test();
		 * test.print();
		 */
	}

}
