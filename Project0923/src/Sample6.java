class Sample6 {

	public static void main(String[] args) {
		String a = new String("     C#");
		String b = new String(", C++ ");
		
		System.out.println(a + "�� ���̴� " + a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b); // ���ڿ� ����
		System.out.println(a);
		
		a = a.trim();//���ڿ� �յ��� ���� ����
		System.out.println(a);
		
		a = a.replace("C#", "Java");//���ڿ� ��ġ
		System.out.println(a);
	}

}
