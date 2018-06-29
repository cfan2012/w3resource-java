import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

    DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
    System.out.println(dateFormat.format(calendar.getTime()));
    for(int i = 0; i <= 4; i++)
      calendar.add(Calendar.DATE, i);
    System.out.println(dateFormat.format(calendar.getTime()));
    
  }
}
