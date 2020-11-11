package kr.or.iei.collectionFramework;

public class HashEx02 {
	public static void main(String[] args) {
		String s1 = "고양이";
		String s2 = "고양이";
		String s3 = new String("고양이");
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s3));
	}
}
