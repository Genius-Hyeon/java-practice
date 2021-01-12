public class Stack {
    private static final int MAX_STACK_SIZE = 10;
    private static int[] stack = new int[MAX_STACK_SIZE];
    private static int top = -1;

    public static void push(int item) {
        if (top >= MAX_STACK_SIZE -1) {
            System.out.println("stack is full.");
        }
        stack[++top] = item;
    }

    public static int pop() {
        if (top == -1) {
            System.out.println("stack is empty.");
        }
        return stack[top--];
    }

    public static boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public static boolean isFull() {
        if (top >= top--)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int e;
        push(20);
        push(30);
        push(40);
        System.out.println("stack's status\n");
        while (!isEmpty()) {
            e = pop();
            System.out.printf("value = %d\n", e);
        }
        System.out.println(isFull());
    }
}
