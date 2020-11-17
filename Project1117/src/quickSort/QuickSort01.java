package quickSort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort01 {

    public static List<Integer> sort(List<Integer> origin) {
        // 0. 탈출 조건
        if (origin.isEmpty())
            return origin;

        // 1. 피벗 선정
        final Integer pivot = origin.get(0);

        // 2. 피벗 중심으로 분류
        List<Integer> less = new ArrayList<>();
        List<Integer> pivots = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (Integer num : origin) {
            if (num < pivot) {
                less.add(num);
            } else if (num > pivot) {
                greater.add(num);
            }else {
                pivots.add(num);
            }

        }
        // 3. 분류된 새로운 리스트들을 정렬(재귀)
        less = sort(less);
        greater = sort(greater);

        // 4. 취합 **********
        less.addAll(pivots);
        less.addAll(greater);
        return less;
    }
}
