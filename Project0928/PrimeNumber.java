public class PrimeNumber {
	public static boolean isPrimeNumber (int num) {
		if (num == 1)
			return false;
		for (int i=2; i<num; i++) {
			if(num%i == 0)
				return false;
		}//for
		return true;
	}

	public static void main(String[] args) {
		for (int i=1; i<101; i++) {
			if (isPrimeNumber(i))
				System.out.print(i + " ");
		}

	}
}

