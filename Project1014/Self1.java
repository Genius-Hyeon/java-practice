package classPM;

abstract class Self01 {
	abstract void show();
}

class Self02 extends Self01{

	@Override
	void show() {
		System.out.println("��ӹ��� Ŭ����");		
	}

}
public class Self1 {

	public static void main(String[] args) {
		Self01 s = new Self01() {
			public void show() {
				System.out.print("�͸� Ŭ����");
			}
		};
		s.show();
		
	}

}
