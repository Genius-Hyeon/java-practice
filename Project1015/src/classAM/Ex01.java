package classAM;
//Ŭ����, ������, �޼ҵ� ������
class Data { //public �� ���� Ŭ����

	//����ʵ�
	public String name;
	public int age;

	public Data() { 
		//������ - Ŭ���� �̸��� ����
		//������ public
		name = "�ʱⰪ";
		age = -1;
		//System.out.println("������ �����Ϸ�");
		//int a; == �������� == ��ȣ �ȿ� ����
		//������������ public ���� �ʿ� ����
	}
	//������ �����ε�
	public Data(String name) {
		this();/******������ ù°��******/
		this.name = name;

	}

	public Data(int age) {
		this();/******������ ù°��******/
		this.age = age;
	}

	public void print() { //�޼ҵ�
		//return���� ���� ���� void �ڸ��� ��ȯ���� ���� ��
		System.out.println(name);
		System.out.println(age);
	}
}

public class Ex01 { //public class == ���ϸ�

	public static void main(String[] args) {
		Data d = new Data();
		d.print();

		Data d1 = new Data("hanna");
		d1.print();

		Data d2 = new Data(33);
		d2.print();
	}

}
