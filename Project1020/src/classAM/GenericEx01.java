package classAM;

//��� Ŭ����
class Apple { 
	public String toString() {
		return "apple";
	}
}

//������ Ŭ����
class Orange {
	public String toString() {
		return "orange";
	}
}
//����ڽ� Ŭ����
class AppleBox {
	private Apple ap; //�������� ����, ����ʵ�

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}

}
//�������ڽ� Ŭ����
class OrangeBox {
	private Orange or;

	public Orange getOr() {
		return or;
	}

	public void setOr(Orange or) {
		this.or = or;
	}
		
}

public class GenericEx01 {
	//FruitBox
	public static void main(String[] args) {
		//���� ��� �ڽ� ����
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		//������ �ڽ��� ��´�.
		/*****************/
		aBox.setAp(new Apple());
		oBox.setOr(new Orange());
		
		//�ڽ����� ������ ������.
		Apple ap = aBox.getAp();
		Orange og = oBox.getOr();
		System.out.println(ap);
		System.out.println(og);
		
	}

}
