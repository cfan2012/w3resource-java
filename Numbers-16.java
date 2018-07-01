import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if(getSum(a)==getSum(b))
      System.out.println("yes");
    else System.out.println("no");
    
  }
  
  public static int getSum(int x){
    int sum = 0;
    for(int i = 1; i<= x; i++)
      if(x % i == 0)
        sum+=i;
    return sum;
  }


}
