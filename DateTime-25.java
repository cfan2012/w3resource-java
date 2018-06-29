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
    Date date = calendar.getTime();
    System.out.println("Current Year: "+date.getYear());
    System.out.println("Is current year leap year? "+leapYear(date.getYear()));
    System.out.println("Length of the year: "+calendar.getActualMaximum(Calendar.DAY_OF_YEAR));
    
        
  }
  
  public static boolean leapYear(int year){
    if( (year % 400 ==0) || ( (year %4 ==0) && (year %100 !=0) ) )
      return true;
    return false;
  }

}
