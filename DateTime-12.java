import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
    String[] day = symbols.getWeekdays();
    for( String s : day )
      System.out.println(s);
    
  }
}
