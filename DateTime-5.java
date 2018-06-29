import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeZone(TimeZone.getTimeZone("America/New York"));
    System.out.println("New York Time : " +  calendar.get(Calendar.HOUR_OF_DAY) + ":" +calendar.get((Calendar.MINUTE)) + ":" + calendar.get(Calendar.SECOND));
  }
}
