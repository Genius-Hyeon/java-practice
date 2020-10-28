package classPM;
import java.util.*;
public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myID", "1234");
		map.put("jihyeon", "1111");
		map.put("easy", "1234");
		Scanner scan = new Scanner(System.in); //화면으로부터 라인 단위로 입력받는다.

		while(true) {
			System.out.println("ID와 비밀번호를 입력해주세요");
			System.out.print("ID: ");
			String id = scan.nextLine().trim();

			System.out.print("비밀번호: ");
			String pw = scan.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요.\n");
				continue;
			} else {
				if(!(map.get(id)).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("아이디와 비밀번호가 일치합니다.");
					break;
				}

			}
		}//while
	}//main

}
