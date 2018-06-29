import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.YEAR, 1);
    Date date = calendar.getTime();
    System.out.println(date);
    calendar.add(Calendar.YEAR, -2);
    date = calendar.getTime();
    System.out.println(date);
  }
}
