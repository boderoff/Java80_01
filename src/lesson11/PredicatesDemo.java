package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesDemo {
    public static <T> int countIf(List<T> list, Predicate<T> condition) {
        int count = 0;
        for (T element : list) {
            if (condition.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1,2,3,4,-1,0,-2);
        int countPositive = countIf(testList, x -> x>0);
        System.out.println(countIf(testList, x -> x<0));
        System.out.println(countPositive);
        List<String> testList2 = Arrays.asList("sdd","fd","23s","fdfdf");
        System.out.println(countIf(testList2, y -> y.length() == 3));
    }
}
