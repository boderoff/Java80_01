package lesson10;

import java.util.ArrayList;
import java.util.List;

public class LestDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("красный");
        myList.add("зеленый");
        myList.add("синий");
        myList.add("красный");

        System.out.println(myList);
        System.out.println(myList.size());

        myList.remove("красный");
        System.out.println(myList);

        myList.remove(1);
        System.out.println(myList);

        System.out.println(myList.get(0));
        myList.set(0,"фиолетовый");
        System.out.println(myList);

        myList.add("желтый");
        myList.add("зеленый");

        System.out.println("Перебор for:");
        for (int i = 0; i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        System.out.println();

        System.out.println("Улучшенный перебор:");
        for(String color : myList) {
            System.out.println(color);
        }
        System.out.println();

        myList.clear();
        System.out.println("После удаления:");
        System.out.println(myList);
    }


}
