package classPM;
import java.util.*;
public class ExceptionCase01 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		try {
			System.out.print("a/b ... a? ");
			int n1 = kb.nextInt();
			System.out.printf("%d \n", n1);
		} catch(Exception e) {
			System.out.println("������ �߻��߽��ϴ�.");
		} finally {

			System.out.println("Good bye~~");
		}
	}

}
