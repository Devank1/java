import java.util.*;

class p3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter n for n*n square matrix");
    n = sc.nextInt();
    //System.out.println((n*(n+1)*(2*n+1))/6);
    int sum = 0;
    while(n!=0){
    sum += n*n;
    n--;
    }
    System.out.println(sum);
  }
}