package classPM;
//interface
interface Show{
	public void show();
	public void count();
}

class Test implements Show{ //�ҿ����� �������̽� �����ͼ� �����ϰ� ����
	public void show() {
		System.out.println("show ����");
	}
	public void count() { 
		//��Ŷ� ����������
	}
}

public class Sample02 {

	public static void main(String[] args) {
		Test t = new Test();
		t.show();

		Show s = new Show() {  //���� �������̽� �̸�
			//���� Ŭ����, �͸� Ŭ����
			//��ȸ�� Ŭ���� - Ŭ������ ���ǿ� ������ ���ÿ� �Ѵ�
			//�ν��Ͻ� ���� ���� �ִ�

			public void show() {
				System.out.println("���� Ŭ���� show ����");
			}
			public void count() {
				//��Ŷ� ����������
			}
		};

		s.show();

	}

}