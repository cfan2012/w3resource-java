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
    Scanner scanner = new Scanner(System.in);
    int year = scanner.nextInt();
    if(isLeapYear(year))
      System.out.println("leap year");
    else System.out.println("not leap year");
  }
  
  public static boolean isLeapYear(int year){
    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
      return true;
    return false;
  }
}
