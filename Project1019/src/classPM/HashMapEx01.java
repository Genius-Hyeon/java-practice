package classPM;
import java.util.*;
public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myID", "1234");
		map.put("jihyeon", "1111");
		map.put("easy", "1234");
		Scanner scan = new Scanner(System.in); //ȭ�����κ��� ���� ������ �Է¹޴´�.

		while(true) {
			System.out.println("ID�� ��й�ȣ�� �Է����ּ���");
			System.out.print("ID: ");
			String id = scan.nextLine().trim();

			System.out.print("��й�ȣ: ");
			String pw = scan.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.\n");
				continue;
			} else {
				if(!(map.get(id)).equals(pw)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println("���̵�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}

			}
		}//while
	}//main

}
