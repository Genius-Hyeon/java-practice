package recursiveFunction;

public class Fibonacci01 {
     public static void main(String[] args) {
         int input = 9;
         for (int i = 1; i<input; i++) {
             System.out.println(fibonacci(i));
         }

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

