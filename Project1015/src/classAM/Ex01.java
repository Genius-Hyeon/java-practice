package classAM;
//클래스, 생성자, 메소드 총정리
class Data { //public 안 붙은 클래스

	//멤버필드
	public String name;
	public int age;

	public Data() { 
		//생성자 - 클래스 이름과 같음
		//무조건 public
		name = "초기값";
		age = -1;
		//System.out.println("생성자 생성완료");
		//int a; == 지역변수 == 괄호 안에 선언
		//지역변수에는 public 붙일 필요 없음
	}
	//생성자 오버로딩
	public Data(String name) {
		this();/******무조건 첫째줄******/
		this.name = name;

	}

	public Data(int age) {
		this();/******무조건 첫째줄******/
		this.age = age;
	}

	public void print() { //메소드
		//return값이 있을 때는 void 자리에 반환값의 형태 들어감
		System.out.println(name);
		System.out.println(age);
	}
}

public class Ex01 { //public class == 파일명

	public static void main(String[] args) {
		Data d = new Data();
		d.print();

		Data d1 = new Data("hanna");
		d1.print();

		Data d2 = new Data(33);
		d2.print();
	}

}
