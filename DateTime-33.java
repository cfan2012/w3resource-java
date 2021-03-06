import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
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
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
//    Scanner scanner = new Scanner(System.in);
    LocalDate date = LocalDate.now();
    System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
    System.out.println(date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
        
  }
}
