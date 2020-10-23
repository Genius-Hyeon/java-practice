class Point {
	int x, y; //멤버필드
	public Point() { //생성자
		System.out.println("Point 클래스 생성");
	}
}

class Sample4
{
	public static void main(String [] args) {
		Point p = new Point();
		System.out.println(p.getClass().getName());
		System.out.println(p.toString());
		System.out.println(p);
	}
}