import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input an integer between 0 and 1000: ");
    int i = scanner.nextInt();
    int x = i, sum = 0;
    while(x / 10 != 0){
      sum += x%10;
      x/=10;
    }
    sum+=x;
    System.out.println("The sum of all digits in " + i + " is "+sum);  
  }
}
