import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    System.out.println(day);
  }
}
