import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  static List<String> list = new ArrayList<String>();

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a number : ");
    int n = scanner.nextInt();
    String s = String.valueOf(n);
    generateList(n);
    boolean flag = true;
    for(String s2: list){
      int x = Integer.parseInt(s2);
      if(!isPrimeNumber(x))
        flag = false;
    }
    if(flag)
      System.out.println("It is a circular_num Prime number." );
    else System.out.println("It is not a Circular Prime number." );
  }

  public static void generateList(int n){
    int num = 0,index = 0,sum = 0;
    String s = String.valueOf(n);
    String s2 = "";
    for(int i = index; index < s.length();){
      s2 += s.charAt(i);
      i++;
      if(i == s.length())
        i = 0;
      sum++;
      if(sum % s.length() ==0){
        index++;
        list.add(s2);
        s2 = "";
        i = index;
      }
    }
  }

  public static boolean isPrimeNumber(int num){
    if(num == 2) return true;
    if(num < 2 || num % 2 == 0) return false;
    for(int i=3; i<=Math.sqrt(num); i+=2)
      if(num % i == 0)
        return false;
    return true;
  }
}
  
  
  



