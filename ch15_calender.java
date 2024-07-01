import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ch15_calender {
    public static void main(String[] args) {
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getTime());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.getCalendarType());
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println(c.get(Calendar.MONTH));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + ":" + c.get(Calendar.MILLISECOND));
        // GregorianCalendar cal = new GregorianCalendar();
        // System.out.println(cal.isLeapYear(2023));
        // System.out.println(TimeZone.getAvailableIDs()[0]);
        // System.out.println(TimeZone.getAvailableIDs()[1]);
        // System.out.println(TimeZone.getAvailableIDs()[2]);
        // System.out.println(TimeZone.getAvailableIDs()[3]);
        // System.out.println(c.getTimeZone());

        // LocalTime t = LocalTime.now();
        // System.out.println(t);
        // LocalDate d = LocalDate.now();
        // System.out.println(d);
        LocalDateTime dt = LocalDateTime.now(); // This is the date.
        System.out.println(dt);
    
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");  // This is format
        String mydate = dt.format(df);  // Creating date String using date and format 
        System.out.println(mydate);
    
    }

}