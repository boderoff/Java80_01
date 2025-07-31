package lesson9;

import java.util.logging.SocketHandler;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc");

            int[] arr = {1, 2, 3};

            System.out.println(arr[4]);
 //       }  catch (NumberFormatException e) {
 //           System.out.println("Ошибка в формате введенного числа " + e.getMessage());
 //       }  catch (ArrayIndexOutOfBoundsException e) {
 //           System.out.println("Ошибка доступа к массиву " + e.getMessage());
        }  catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}


