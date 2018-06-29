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
    int num[] =new int[10];
    int sum3 = 0;
    for (int i = 1; i < 1000; i++){
      int x2 = i * i;
      int x = x2;
      int sum = 1;
      while(x/10 != 0){
        num[sum++] = x % 10; // 2025 --> 5202
        x/=10;
      }
      num[sum] = x;
      int k = 1;
      int j;
      int sum1 = 0, sum2 =0;
      for(j = 1; j <= (sum+1)/2; j++){
        sum2 += num[j] * k;
        k *= 10;
      }
      k = 1;
      for(; j <= sum; j++){
        sum1 += num[j] * k;
        k *= 10;
      }
      if (sum1 +sum2 == i){
        System.out.println(i+"       "+x2+"       "+sum1+"+"+sum2);
        sum3++;
      }
      
    }
    System.out.println(sum3+" Kaprekar numbers. ");
    }
}
