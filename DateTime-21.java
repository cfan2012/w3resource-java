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
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
//    Scanner scanner = new Scanner(System.in);
    for(String i: ZoneId.SHORT_IDS.keySet()){
      System.out.print(ZoneId.of(ZoneId.SHORT_IDS.get(i)) + " ");
      System.out.println(LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(i))));
      
    }
  }

}
