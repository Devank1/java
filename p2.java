import java.util.*;
class oddEven{
  void f1(){
    
    Scanner sc = new Scanner(System.in);
    int m,n;
    
    System.out.println("Enter the no. of rows and columns"); 
    m = sc.nextInt();
    n = sc.nextInt();
    int[][] a = new int[m][n];
    int[][] b = new int[n][m];

    for(int i = 0; i<m; ++i){
      for(int j =0; j<n; ++j){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i = 0; i<n; ++i){
      for(int j =0; j<m; ++j){
        b[i][j]=a[j][i];
      }
    }
    System.out.println("The transposed matrix is:");
      for(int i = 0; i<n; ++i){
      for(int j =0; j<m; ++j){
        System.out.print(b[i][j]+  "\t");
      }
      System.out.println();
    }
  }
}
class transpose extends oddEven{
  void f1(){
    
    Scanner sc = new Scanner(System.in);
    int m;
    
    System.out.println("Enter the size of the array"); 
    m = sc.nextInt();
    
    int[] a = new int[m];

    System.out.println("Enter the elements of  the array");
    for(int i = 0; i<m; ++i){
        a[i]=sc.nextInt();
    }
    int[] odd = new int[m];
    int[] even = new int[m];
    int k = 0, l=0;
    
    for(int i=0;i<m;i++) {
     	if(a[i]%2==0) {
	  		even[k]=a[i];
	  		k++;
	  	}
	  	else {
	  		odd[l]=a[i];
	  		l++;
	  	}
	    }
	    System.out.println("even array elements:");
	    for(int i=0;i<k;i++) {
	    	System.out.print(even[i]+"\t");
	    }
	    System.out.println();
	    System.out.println("odd array elements:");
	    for(int i=0;i<l;i++) {
	    	System.out.println(odd[i]+"\t");

      sc.close();
	  }     
  }
}
 class p2{
   public static void main(String[] args){
     oddEven o1 = new oddEven();
     oddEven o2 = new transpose();

     o1.f1();
     o2.f1();
   }
 }