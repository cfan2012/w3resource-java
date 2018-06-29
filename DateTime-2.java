import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    //Scanner scanner = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    System.out.println("Year: " + calendar.get(Calendar.YEAR));
    System.out.println("Month: " + calendar.get(Calendar.MONTH));
    System.out.println("Day: " + calendar.get(Calendar.DATE));
    System.out.println("Hour: " + calendar.get(Calendar.HOUR));
    System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
    
    
  }
}
