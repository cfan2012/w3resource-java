import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    System.out.println("Year: " + calendar.getActualMinimum(Calendar.YEAR));
    System.out.println("Month: " + calendar.getActualMinimum(Calendar.MONTH));
    System.out.println("Day: " + calendar.getActualMinimum(Calendar.DATE));
    System.out.println("Hour: " + calendar.getActualMinimum(Calendar.HOUR));
    System.out.println("Minute: " + calendar.getActualMinimum(Calendar.MINUTE));
  }
}
