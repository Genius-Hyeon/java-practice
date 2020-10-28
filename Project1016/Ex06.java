package classAM;
import java.util.ArrayList;

public class Ex06 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//import java.util.List;
		//List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("c++");
		
		int size = list.size();
		
		for(int i=0; i<size; i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}

}
