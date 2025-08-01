package lesson10;

public class Pair <U, V>{
    private U first;
    private V second;
    Pair(U first, V second){
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
