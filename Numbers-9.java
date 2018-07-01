import java.util.Scanner;

public class Main {

  public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    for(int i=0; i <= 99999999 & sum <10; i++)
      if(isHappy(i)){
        sum++;
        System.out.println(i);
      }
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
