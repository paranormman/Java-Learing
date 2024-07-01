import java.util.*;
import java.util.Map.*;


public class ch15_linked_list {
    public static void main(String[] args) {
        /*
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(1, 5);
        ls.addLast(12);
        ls.addFirst(12);
        System.out.println(ls);

        List<String> str = new ArrayList<String>();
        str.add("Red");
        str.add("Green");
        str.add("White");
        str.add("Black");
        System.out.println(str);
        ListIterator<String> lst = str.listIterator(str.size());
        while(lst.hasPrevious()){
            String name = lst.previous();
            System.out.print(name);
            System.out.print(" ,");
        }
        System.out.println();

        Set<String> st = new HashSet<String>();
        st.add("Orange");
        st.add("Violet");
        st.add("Blue");
        System.out.println(st);

        Set<String> se = new TreeSet<>();
        se.add("a");
        se.add("B");
        se.add("c");
        se.add("D");
        se.add("A");
        System.out.println(se);

        */

        Map<Integer, String> ind = new HashMap<Integer, String>();
        ind.put(10, "Sachin");
        ind.put(18, "Virat");
        ind.put(7, "Dhoni");
        ind.put(48, "Rohit");
        System.out.println(ind);
        Map<Integer, String> aus = new HashMap<>();
        aus.put(11, "Warner");
        aus.put(14, "Smith");
        aus.put(19, "Marnus");
        System.out.println(aus);
        Map<Integer, String> iplind = new HashMap<>();
        iplind.putAll(ind);
        iplind.putAll(aus);
        System.out.println(iplind);
        System.out.println("Iterating map using entryset()");
        Set<Entry<Integer, String>> itr = iplind.entrySet();
        for(Entry<Integer, String> val : itr){
            int key = val.getKey();
            String value = val.getValue();
            System.out.println("Key = " + key + " Value = " + value);
        }
        System.out.println("Iterating using keySet()");
        Set<Integer> s = aus.keySet();
        for(int i:s){
            System.out.println("Key value is " + i);
        }
        System.out.println("Iterating using valueSet()");
        Collection<String> i = ind.values();
        for(String j : i){
            System.out.println("Value of the key is "+ j);
        }

        System.out.println("Years passed since java keeps track of years " + System.currentTimeMillis()/1000/3600/24/365);

        Date d = new Date();
        System.out.println(d);

        // for(int i = 0; i < ls.size(); i++){
        //     System.out.print(ls.get(i));
        //     System.out.print(", ");
        // }
    }
}
