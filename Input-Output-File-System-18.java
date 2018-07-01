import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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

  private static File file = new File("C:\\Users\\thinkpad\\Desktop\\a.txt");

  private static String findLongestWordInFile() throws FileNotFoundException {

    Scanner scanner = new Scanner(file);
    String longestWord = "", currentWord;

    while (scanner.hasNext()) {
      currentWord = scanner.next();
      if (currentWord.length() > longestWord.length()) longestWord = currentWord;
    }
    return longestWord;
  }
  

  public static void main(String[] args) throws FileNotFoundException {
    System.out.printf("The longest word in the file \"%s\" is: %s", file.getAbsolutePath(), findLongestWordInFile());
  }
}
