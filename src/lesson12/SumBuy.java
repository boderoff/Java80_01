package lesson12;

import lesson4.IntegerComparison;

import java.util.*;
import java.util.stream.Collectors;

public class SumBuy {
    public static void main(String[] args) {
        List<Purchase> purch = new ArrayList<>();
        purch.add(new Purchase("apple",3));
        purch.add(new Purchase("banana",12));
        purch.add(new Purchase("apple",3));

        Map<String,Integer> productQty = purch.stream()
                .collect(Collectors.toMap(
                        Purchase::getProduct,
                        Purchase::getQty,
                        Integer::sum,
                        LinkedHashMap::new

                ));
        System.out.println(productQty);

    }
}
