package classPM;
import java.util.Scanner;
class Sample {
	public String name;

	public Sample() {
		
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 이름을 입력해주세요. >> " );
		name = scan.next();
	
		scan.close();
	}
	
	public void print() {
		System.out.println("학생 이름: " + name);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.input();
		s.print();
		
	}

}
