package quickSort;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 3, 8, 4, 9, 1, 6, 2, 7);
        System.out.println(list);
        final List<Integer> sorted = QuickSort01.sort(list);
        System.out.println(sorted);
    }
}