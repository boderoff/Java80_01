package lesson4;

public class IntegerComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println("a = 100, b = 100 → a == b: " + (a == b));       // true (внутри кэша)
        System.out.println("a.equals(b): " + a.equals(b));                 // true (значения равны)

        Integer c = 200;
        Integer d = 200;
        System.out.println("c = 200, d = 200 → c == d: " + (c == d));       // false (вне кэша)
        System.out.println("c.equals(d): " + c.equals(d));                 // true

        Integer e = new Integer(100);                               // Устаревшее, помечено к удалению
        Integer f = 100;
        System.out.println("e = new Integer(100), f = 100 → e == f: " + (e == f)); // false (e — новый объект)
        System.out.println("e.equals(f): " + e.equals(f));                 // true

        int g = 100;
        System.out.println("f = 100, g = 100 (int) → f == g: " + (f == g)); // true (f автоприведен к int)

        Integer h = 127;
        Integer i = 127;
        System.out.println("h = 127, i = 127 → h == i: " + (h == i));       // true (граница кэша)

        Integer j = 128;
        Integer k = 128;
        System.out.println("j = 128, k = 128 → j == k: " + (j == k));       // false (за пределами кэша)

    }
}
