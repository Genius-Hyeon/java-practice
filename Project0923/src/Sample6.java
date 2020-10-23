class Sample6 {

	public static void main(String[] args) {
		String a = new String("     C#");
		String b = new String(", C++ ");
		
		System.out.println(a + "의 길이는 " + a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b); // 문자열 연결
		System.out.println(a);
		
		a = a.trim();//문자열 앞뒤의 공백 제거
		System.out.println(a);
		
		a = a.replace("C#", "Java");//문자열 대치
		System.out.println(a);
	}

}
