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
    LocalDate date = LocalDate.now();
    System.out.println("Default format of LocalDate="+date);
    System.out.println(date.format(DateTimeFormatter.ofPattern("dd::MMM:uuuu")));
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("Default format of LocalDateTime="+dateTime);
    System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
    Instant timestamp = Instant.now();
    System.out.println("Default format of Instant="+timestamp);
    LocalDateTime dt = LocalDateTime.parse("27::四月::2014 21::39::48",
        DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
    System.out.println("Default format after parsing = "+dt+"\n");
        
  }

}
