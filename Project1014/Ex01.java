package classAM;

public class Ex01 {
	//블로그에 정리
	//메모리영역 - 데이터, 스택, 힙
	public Ex01() {
		//안 만들면 컴퓨터가 자동으로 만듦
		//void 안 붙임 - return값이 없다
	}

	static void count() {
		//static - void main이 시작되기 전에 데이터 영역에 올라감
		//->new를 만나지 않아도 쓸 수 있음
		//static이 붙지 않으면 new를 만나야 함
		int count = 0;
		for (int i=1; i<51; i++) {
			if (i %3 == 0)
				count++;
		}
		System.out.println("1부터 50까지 3의 배수: " + count + "개");

	}
	public static void main(String[] args) {
		//static = 데이터 영역
		count(); //메소드

	}

}

//for(int i=3; i<51; i+=3) - if문 안 쓰기