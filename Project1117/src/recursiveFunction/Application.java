package recursiveFunction;
// 재귀 없는 팩토리얼

public class Application {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        int ret = 1;
        while(n >= 1) {
            ret *= n--;
        }
        return ret;
    }

}

