import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
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
   try{
     FileInputStream is = new FileInputStream("C:\\Users\\thinkpad\\Desktop\\a.txt");
     int n = 512;
     byte buffer[] = new byte[n];
     while ((is.read(buffer, 0, n) != -1) && (n > 0))
       System.out.print(new String(buffer));
     is.close();
   } catch (FileNotFoundException e){
     System.out.println(e);
   }
   catch (IOException e){
     System.out.println(e);
   }
   
   
    
    
     
      
    }
}
