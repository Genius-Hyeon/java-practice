package exarr;

public class Sample1_1 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = i+1;
		}
		
		for (int i = 0; i < arr.length; i++)
		{
			System.err.print(arr[i] + " ");
			
		}
	}

}
