import java.util.*;

class p13{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int rno;
    long phno;
    String name, pw=new String();
    
    System.out.println("Enter your name: ");
    name = sc.next();
    int len = name.length();

    System.out.println("Enter your rno: ");
    rno = sc.nextInt();
    int rno1=rno;
    
    System.out.println("Enter your phno: ");
    phno = sc.nextLong();

    char []sym={')','!','@','#','$','%','^','&','*','('};
    rno = 1+(rno-1)%9;
    pw=""+name.charAt(0)+(phno%10)+rno+sym[(rno1/100)%len]+name.charAt(len-1);
		System.out.println(pw);
  }
}