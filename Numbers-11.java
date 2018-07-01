import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a number : ");
    int n = scanner.nextInt();
    String s = String.valueOf(n);
    double sum = 0;
    for(int i = 1; i <= s.length(); i++){
      double x = (s.charAt(i-1)-'0');
      sum += Math.pow(x,i);
//      System.out.println(sum);
    }
    if(sum == n)
      System.out.println("It's a Disarium Number.");
    else System.out.println("Not a Disarium Number.");
  }
  
  
}


