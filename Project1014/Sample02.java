package classPM;
//interface
interface Show{
	public void show();
	public void count();
}

class Test implements Show{ //불완전한 인터페이스 가져와서 완전하게 만듦
	public void show() {
		System.out.println("show 실행");
	}
	public void count() { 
		//빈거라도 만들어줘야함
	}
}

public class Sample02 {

	public static void main(String[] args) {
		Test t = new Test();
		t.show();

		Show s = new Show() {  //구현 인터페이스 이름
			//무명 클래스, 익명 클래스
			//일회용 클래스 - 클래스의 정의와 생성을 동시에 한다
			//인스턴스 옆에 블럭이 있다

			public void show() {
				System.out.println("무명 클래스 show 실행");
			}
			public void count() {
				//빈거라도 만들어줘야함
			}
		};

		s.show();

	}

}