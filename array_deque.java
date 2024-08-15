import java.util.ArrayDeque;

public class array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        l1.add(5);
        l1.add(6);
        System.err.println(l1.getFirst());
        System.err.println(l1.getLast());
    }
}
