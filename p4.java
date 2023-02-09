import java.util.*;

class p4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ch ;
    do{
      int a,b;
      System.out.println("Enter the values of a and b");
      a = sc.nextInt();
      b = sc.nextInt();
      
      System.out.println("Enter the operation to be performed\n1. Add\t2. Subtract\t3. Multiply\t4. Divide\t5. Exit");
      ch = sc.nextInt();
      
      switch(ch){
        case 1: System.out.println("Addition is " + (a+b));
          break;
        case 2: System.out.println("Subtraction is " + (a-b));
          break;
        case 3: System.out.println("Multiplication is " + (a*b));
          break;
        case 4: System.out.println("Division is " + (a/b));
          break;
        case 5: System.exit(0); 
          
      }
    }while(ch!=5);
  }
}