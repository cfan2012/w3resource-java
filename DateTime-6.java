import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    System.out.println("Current full date and time is : " + (calendar.get(Calendar.MONTH) + 1) + "-"
        + calendar.get(Calendar.DATE) + "-" + calendar.get(Calendar.YEAR) + " "
        + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":"
        + calendar.get(Calendar.SECOND) + "." + calendar.get(Calendar.MILLISECOND));  }
}
