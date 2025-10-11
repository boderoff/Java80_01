package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorRemove {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,4,1,3,5,1));
//        ConcurrentModificationException — исключение в Java, которое возникает,
//        когда поток пытается изменить коллекцию, в то время как другой поток выполняет итерацию по ней.
//        for (int x : nums) {
//            if (x%2 == 0) {
//                nums.remove(x);
//            }
//        }
        // Правильная реализация
        nums.removeIf(n->n%2 == 0);
        System.out.println(nums);

    }
}
