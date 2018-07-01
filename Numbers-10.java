import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    if(isHappy(x))
      System.out.println("yes");
    else  System.out.println("no");
  }

  public static boolean isHappy(int n) {
    if(n == 0)
      return false;
    if(n == 1)
      return true;
    int temp = 0;
    boolean flag[]=new boolean[811];
    int yushu = 0;
    while(true){
      while(n != 0){
        yushu = n % 10;
        n = n / 10;
        temp += yushu*yushu;
      }
      if(temp == 1)
        return true;
      if(flag[temp])
        return false;
      else
        flag[temp] = true;
      n = temp;
      temp = 0;
    }
  }

}
