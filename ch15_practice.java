import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class ch15_practice {
    public static void main(String[] args) {
        List<String> lt = new ArrayList<String>();
        lt.add("Raju");
        lt.add("Manju");
        lt.add("Tommy");
        lt.add("Doggy");
        lt.add("Astry");
        for (String n : lt) {
            System.out.println(n);
        }

        HashSet<Integer> st = new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(10);
        st.add(60);
        System.out.println(st);

        Date d = new Date();
        System.out.println(d.getDate());
        System.out.println(d.getHours() +":"+ d.getMinutes() +":"+ d.getSeconds());

        Calendar cl = Calendar.getInstance();
        System.out.println(cl.get(Calendar.HOUR_OF_DAY) +":"+ cl.get(Calendar.MINUTE) +":"+ cl.get(Calendar.SECOND));

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m:s a");  // This is format
        String mydate = dt.format(df);  // Creating date String using date and format 
        System.out.println(mydate);

    }
}
