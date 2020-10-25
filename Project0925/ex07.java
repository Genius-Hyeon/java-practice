package ex0925;
public class ex07 {

	public static void main(String[] args) {
		
		int arr[] = {45, 66, 84, 55, 64, 88, 99};
		int max = 0;
		int min = arr[0];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max) {
			max = arr[i];
			}
			
			if (arr[i] < min) {
				min = arr[i];
			}
			sum += arr[i];
		}
		
		System.out.println("최대값과 최소값을 제외한 합계: " + (sum - max - min));
		}
}
