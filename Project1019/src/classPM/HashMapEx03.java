package classPM;
import java.util.*;
//중복 제거 , 검색
public class HashMapEx03 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Person("hanna", 36));
		set.add(new Person("mina,", 18 ));
		System.out.println(set);

	}
}

class Person{
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ": " + age;
	}
}

