import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
//    Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    calendar.set(2017+1900,2,14);
    Date date = calendar.getTime();
    System.out.println("Integer value of the current month: "+date.getMonth());
    System.out.println("Length of the month: "+ calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    System.out.println("Maximum length of the month: "+ calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        
  }
}
