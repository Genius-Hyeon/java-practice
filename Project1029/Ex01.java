//동등성과 동일성

public class Ex01 {
	
	public static void main(String[] args) {
		StickCoffee sc1 = new StickCoffee("maxim", 1000);
		StickCoffee sc2 = new StickCoffee("maxim", 1000);
		
		System.out.println(sc1 == sc2);
		System.out.println(sc1.equals(sc2));
		System.out.println(sc1.getClass());
	}
	
}
