import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    System.out.println("Year: " + calendar.getActualMaximum(Calendar.YEAR));
    System.out.println("Month: " + calendar.getActualMaximum(Calendar.MONTH));
    System.out.println("Day: " + calendar.getActualMaximum(Calendar.DATE));
    System.out.println("Hour: " + calendar.getActualMaximum(Calendar.HOUR));
    System.out.println("Minute: " + calendar.getActualMaximum(Calendar.MINUTE));
  }
}
