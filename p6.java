import java.util.*;

class p6{
  public static void main(String[] args){
    ArrayList<String> ar = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 strings: ");
    for(int i = 0; i<5; ++i){
      String s = sc.next();
      ar.add(s);
    }
    Collections.sort(ar);
    System.out.println("The strings in lexographically sorted order are");
    for(String i: ar){
      System.out.println(i);
    }
  }
}