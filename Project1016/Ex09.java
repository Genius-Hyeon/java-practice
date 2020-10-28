package classAM;
//»ó¼Ó
class People {
	public String name;
	public String ssn;

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public void print() {
		System.out.println("name: " + name);
		System.out.println("ssn: " + ssn);
	}
	
}

class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

	public void print() {
		super.print();
		System.out.println("studentNo: " + studentNo);	

	}

}
public class Ex09 {

	public static void main(String[] args) {
		Student student = new Student("È«±æµ¿", "123456-1234567", 1);
		student.print();
	}

}
