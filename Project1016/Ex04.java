package classPM;
//피보나치 수열
public class Ex04 {

	public static void main(String[] args) {
		int i;
		int[] ret = new int[10];
		ret[0] = 1;
		ret[1] = 1;
		for (i=2; i<10; i++) {
			ret[i] = ret[i-1] + ret[i-2];
		}
		
		System.out.println(ret[9]);

	}

}
