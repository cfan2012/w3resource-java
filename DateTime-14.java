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
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);
  }
}
