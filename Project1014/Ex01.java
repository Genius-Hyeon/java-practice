package classAM;

public class Ex01 {
	//��α׿� ����
	//�޸𸮿��� - ������, ����, ��
	public Ex01() {
		//�� ����� ��ǻ�Ͱ� �ڵ����� ����
		//void �� ���� - return���� ����
	}

	static void count() {
		//static - void main�� ���۵Ǳ� ���� ������ ������ �ö�
		//->new�� ������ �ʾƵ� �� �� ����
		//static�� ���� ������ new�� ������ ��
		int count = 0;
		for (int i=1; i<51; i++) {
			if (i %3 == 0)
				count++;
		}
		System.out.println("1���� 50���� 3�� ���: " + count + "��");

	}
	public static void main(String[] args) {
		//static = ������ ����
		count(); //�޼ҵ�

	}

}

//for(int i=3; i<51; i+=3) - if�� �� ����