import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    YearMonth yearMonth = YearMonth.of(2018,5);
    String first = yearMonth.atDay(1).getDayOfWeek().name();
    String last = yearMonth.atEndOfMonth().getDayOfWeek().name();
    System.out.println(first);
    System.out.println(last);
    
  }
}
