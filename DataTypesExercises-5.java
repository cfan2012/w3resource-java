import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the time zone offset to GMT: ");
    long time = scanner.nextInt();
    long totalMillisSeconds = System.currentTimeMillis();
    long totalSeconds = totalMillisSeconds/1000;
    int nowSeconds = (int)totalSeconds%60;
    long totalMinutes = totalSeconds/60;
    int nowMinutes = (int)totalMinutes%60;
    long totalHours = totalMinutes/60;
    long nowHours = ((totalHours + time) % 24);
    System.out.println("Current time is " + nowHours + ":" + nowMinutes + ":" + nowSeconds);  }
}
