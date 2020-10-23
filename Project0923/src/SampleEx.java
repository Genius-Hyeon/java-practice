public class SampleEx {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}//0부터 4까지 출력
		for (int i = 1; i < 5; i++) {
			System.out.println("for문: " + i + "동작 중");
			if(i %2 == 0) {
			System.out.println("프로그램을 정상종료합니다.");
			}
		}
	}
}
