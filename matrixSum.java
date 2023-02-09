import java.util.*;

class Sum{
  void sum(int [][]a, int [][]b, int r,int c){
    int [][]d= new int[r][c];
    System.out.println("The sum of matrixes are: ");
    for(int i = 0; i < r; ++i){
      for(int j=0; j < c; ++j){
        d[i][j] = a[i][j]+b[i][j];
      }
    }
    for(int i = 0; i < r; ++i){
      for(int j=0; j < c; ++j){
        System.out.print(d[i][j]+"\t");
      }
    System.out.println();
    }
  }
}

class matrixSum{
  public static void main(String[] args){
    int m,n;
    System.out.println("Enter value of m and n");
    Scanner ob = new Scanner(System.in);
    m=ob.nextInt();
    n=ob.nextInt();
    int [][]a=new int[m][n];
	  int [][]b=new int[m][n];
    System.out.println("Enter the elements of matrix A");
    for(int i = 0; i<m; ++i){
      for(int j = 0; j<n; ++j){
        a[i][j]=ob.nextInt();
      }
    }
    System.out.println("Enter the elements of matrix B");
    for(int i = 0; i<m; ++i){
      for(int j = 0; j<n; ++j){
        b[i][j]=ob.nextInt();
      }
    }
    Sum S= new Sum();
    S.sum(a,b,m,n);
  }
}