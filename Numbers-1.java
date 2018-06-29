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
    Scanner scanner = new Scanner(System.in);
   System.out.print("Test Date:Input an integer number: ");
   int number = scanner.nextInt();
   while(number % 5 ==0)
     number /= 5;
//    System.out.println(number);
   while (number %2 ==0)
     number /= 2;
//    System.out.println(number);
   while(number %3 == 0)
     number /= 3;
//    System.out.println(number);
   if(number == 1)
     System.out.println("It is an ugly number.");
   else System.out.println("It is not an ugly number.");
        
  }
}
