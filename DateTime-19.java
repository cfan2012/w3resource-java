import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
//    Scanner scanner = new Scanner(System.in);
    LocalDate right = LocalDate.now();
    LocalDate left = LocalDate.of(2017, Month.JUNE, 30);
    Period diff = Period.between(left,right);
    System.out.println("Year:"+diff.getYears()+"Month:"+diff.getMonths()+"Day:"+diff.getDays());
  }

}
