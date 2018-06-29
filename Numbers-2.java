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
import static java.util.stream.LongStream.rangeClosed;

public class Main {

  public static void main(String args[]) {
//    Scanner scanner = new Scanner(System.in);
      int count_Deficient_no = 0;
      int count_Perfect_no = 0;
      int count_Abundant_no = 0;

      for (long i = 1; i <= 10_000L; i++) {
        long sum = proper_Divs_Sum(i);
        if (sum < i)
          count_Deficient_no++;
        else if (sum == i)
          count_Perfect_no++;
        else
          count_Abundant_no++;
      }
      System.out.println("Number Counting [(integers) between 1 to 10,000]: ");
      System.out.println("Deficient number: " + count_Deficient_no);
      System.out.println("Perfect number: " + count_Perfect_no);
      System.out.println("Abundant number: " + count_Abundant_no);
    }
    public static Long proper_Divs_Sum(long num) {
      return rangeClosed(1, (num + 1) / 2).filter(i -> num % i == 0 && num != i).sum();
    }
        
  
}
