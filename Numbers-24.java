import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    String s = String.valueOf(x);
    int i,j;
    boolean flag = true;
    for(i = 0,j = s.length()-1; i<= s.length()/2 && j>= s.length()/2; i++,j--)
      if(s.indexOf(i) != s.indexOf(j)){
        flag = false;
        break;
      }
    if(flag)
      System.out.println("It is a Palindrome number.");
    else System.out.println("Not a palindrome");
  }
}


