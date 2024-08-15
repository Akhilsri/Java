import java.util.Vector;

public class rough{
    public static void main(String[] args) {
        //Synchronised , array-based Implementation , Thread Safety
        Vector<Integer> a = new Vector<>();
        // ArrayList<Integer> b = new ArrayList<>();
        a.add(23);
        a.add(24);
        a.add(25);
        a.add(26);
        a.add(27);
        System.out.println(a);
    }
}