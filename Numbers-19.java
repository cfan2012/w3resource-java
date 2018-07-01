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
    for(int i = 1 ; i<= s.length(); i++ ){
      int n2 = n * i;
      String s2 = String.valueOf(n2);
      if(!list.contains(s2))
        flag = false;
    }
    if(flag)
      System.out.println("It is a cyclic number.");
    else System.out.println("Not a cyclic number.");
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
  
  
  
}


