import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    if(hash(x))
      System.out.println("yes");
    else  System.out.println("no");
  }

  public static boolean hash(int i){
    int sum = 0;
    for(int tmp = i ; tmp!=0 ; sum += tmp % 10 , tmp /= 10);
    if(i % sum == 0)
      return true;
    return false;
  }

}
