import java.util.ArrayList;
import java.util.Collection;

public class main13_collection_framework{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l2.add(14);
        l2.add(12);
        l2.add(16);
        l2.add(18);
        l1.add(5, 11);
        l1.addAll(l2);
        for(int i=0;i<l1.size();i++){
            System.err.println(l1.get(i));
        }
    }
}