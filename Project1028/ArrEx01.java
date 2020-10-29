
public class ArrEx01 {

	public static void main(String[] args) {
		final String[] fruits = {"포도", "사과"};
		int length = fruits.length;

		for (String values : fruits) {
			System.out.println(values);
		}
		
		for(int i=0; i<length; i++) {
			System.out.println(fruits[i]);
		}
	}

}
