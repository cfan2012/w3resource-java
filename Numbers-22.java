import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a number: ");
    int m = scanner.nextInt();
    boolean flag = false;
    for (int i = 2; i <= Math.sqrt(m) + 1; i++) {
      if (m % i == 0) 
        break;
       else {
        if (m >= 2 && i == (int) Math.sqrt(m) + 1)
          flag = true;
      }
    }
  if(flag)
    System.out.println( m + " is a Mersenne number.");
  else System.out.println( m + " is not a Mersenne number.");
  }
}


