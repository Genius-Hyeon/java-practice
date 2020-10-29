public class Ex02 {
	public static void main(String[] args) {
		String a = "A";
		String b = "A";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		int data = 888;
		double pi = 3.14;
		String kor = "가나다";
		String eng = "ABC";
		
		System.out.println(kor.hashCode());
		System.out.println(eng.hashCode());
	}

}
