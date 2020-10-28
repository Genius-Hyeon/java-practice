package classAM;

public class StaticEx {
	static int a = 0;
	
	public static void count() {
		a++;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		s1.count();
		
		StaticEx s2 = new StaticEx();
		s2.count();
		System.out.println(s1.a);
		
		StaticEx s3 = new StaticEx();
		s3.count();
		System.out.println(s1.a);

	}

}
