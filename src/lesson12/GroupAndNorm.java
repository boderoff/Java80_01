package lesson12;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAndNorm {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java","kotlin","Java","js","kafka");
        Map<Character,List<String>> res = words.stream()
                .collect(Collectors.groupingBy(
                        word -> Character.toUpperCase(word.charAt(0)), //преобразует из слова 1 букву в верх и типа по нему группируем
                        Collectors.mapping(
                                String::toUpperCase,  //тут уже наполняем лист
                                Collectors.collectingAndThen(
                                        Collectors.toCollection(TreeSet::new),   //три сет автоматом удаляет дубликаты и сортирует
                                        ArrayList::new
                                )
                        )));
        System.out.println(res);
    }
}
