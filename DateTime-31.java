import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.Duration;
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
    LocalDateTime left = LocalDateTime.of(2018,6,28,1,1,1);
    LocalDateTime right = LocalDateTime.of(2018,6,28,2,1,1);
    long diff = Duration.between(left,right).toHours();
    System.out.println(diff);
        
  }
}
