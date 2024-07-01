import java.util.*;

public class ch15_Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(15);

        l1.add(0, 1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(15);
        l1.add(1, 6);
        l1.remove(1);
        l1.addAll(l2);
        System.out.println(l1.size());
        System.out.println(l2.size());
        // l1.clear();
        System.out.println(l1.contains(2));
        // System.out.println(l1.containsAll(l2));
        // System.out.println(l2.containsAll(l1));
        // l1.ensureCapacity(12);
        System.out.println(l1.indexOf(10));
        // l1.remove(1);
        l1.set(1, 500);
        System.out.println(l1.subList(0, 2));    
        l1.retainAll(l2);    

        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
    
}
