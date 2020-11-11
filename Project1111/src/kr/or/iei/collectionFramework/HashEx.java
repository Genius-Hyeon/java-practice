package kr.or.iei.collectionFramework;

class Student {
	String name;
	String number;

	public Student(String name, String number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (this.number == null && other.number == null) {
//			if (other.number != null)
			return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}

public class HashEx {
	public static void main(String[] args) {

		Student s1 = new Student("È«±æµ¿", "1234");
		Student s2 = new Student("È«±æµ¿", "1234");

		if(s1.equals(s2)) {
			System.out.println("µÎ °´Ã¼´Â °°´Ù.");

		}
		else {
			System.out.println("µÎ °´Ã¼´Â ´Ù¸£´Ù.");
		}

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}
}
