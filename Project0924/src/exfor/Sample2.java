package exfor;
class Point{
	int x = 10;
}
public class Sample2 {

	public static void main(String[] args) {
	
		Point[] p = new Point[3];
		
		for (int i = 0; i < 3; i++) {
			p[i] = new Point();
			p[0].x = 22;
			System.out.println(p[i].x);
			
		}
	}

}
