package lesson12;


import java.util.*;
import java.util.stream.*;

import static java.lang.Math.*;

public class partitioningBy {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> result= nums.stream()
                .collect(Collectors.partitioningBy(
                        n -> n > 1 && IntStream.rangeClosed(2, (int) sqrt(abs(n))).noneMatch((i -> n % i == 0)))
                );
        System.out.println(result);
    }
}
