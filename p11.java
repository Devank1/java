// add digits
import java.util.*;

class p11{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n ;
    System.out.println("Enter a number");
    n = sc.nextInt();
    int sum = (n==0)?0:1+(n-1)%9;
    System.out.println(sum);
  }
}