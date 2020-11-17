package recursiveFunction;

public class RecursiveFunction01 {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    /*
    *
    * @param n항 번호
    * @return 피보나치 수열의 해당 항 값
    *
    * */

    private static int fibonacci(int n) {
        //탈출조건
        if (n<=1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
