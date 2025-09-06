package lesson11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class lyambdaIntroduction {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1);
        Collections.sort(numbers,new Comparator<Integer>(){
           public int compare(Integer o1, Integer o2) {
               return o1.compareTo(o2);
           }
        });
        for (Integer num : numbers) {
            System.out.println(num);
        }
        System.out.println();
        List<Integer> numbers2 = Arrays.asList(5, 2, 9, 1);
        numbers2.sort((a, b) -> b-a);
        for (Integer num : numbers2) {
            System.out.println(num);
        }
    }
}
