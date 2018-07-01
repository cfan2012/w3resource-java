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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import static java.util.stream.LongStream.rangeClosed;

public class Main {

  public static void main(String args[]) {
//    Scanner scanner = new Scanner(System.in);
//    File file = new File("C:\\Users\\thinkpad\\Desktop\\a.txt");
    String string = "";
    List<String>list = new ArrayList<String>();
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\thinkpad\\Desktop\\a.txt"));
      while (string != null){
        string = bufferedReader.readLine();
        list.add(string);
        if(string == null)
          break;
        bufferedReader.close();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(Arrays.toString(list.toArray()));
  }
}
