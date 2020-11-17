package quickSort;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class QuickSort02 {

    public static List<Integer> sort(List<Integer> origin) {
        // 0. 탈출 조건
        if (origin.isEmpty())
            return origin;

        // 1. 피벗 선정
        final Integer pivot = origin.get(0);

        // 2. 피벗 중심으로 분류
        List<Integer> less = filter(origin, x -> x < pivot);
        List<Integer> pivots = filter(origin, x -> x.equals(pivot));
        List<Integer> greater = filter(origin, x -> x > pivot);

        // 3. 분류된 새로운 리스트들을 정렬(재귀)
        less = sort(less);
        greater = sort(greater);

        // 4. 취합 **********
        less.addAll(pivots);
        less.addAll(greater);
        return less;
    }

    private static List<Integer> filter(List<Integer> target, Predicate<Integer> function) {
        return target.stream().filter(function).collect(Collectors.toList());
    }
}
