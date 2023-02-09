import java.util.*;
class Search{
  void binarySearch(int[] a,int n,int target){  
     int low = 0;
     int high = n-1;
     int mid;
     while(low<=high){
       mid = low + (high - low)/2;
       if(a[mid]==target) {
         System.out.println("Element "+ a[mid]+" is found at index "+ mid);
         break;
       }
       else if(a[mid]>target) high = mid-1;
       else low = mid+1;
     }
     if(low>high)System.out.println("Element not found");
   }
}

class p7{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n, target;
    System.out.println("Enter the size of array");
    n = sc.nextInt();
    System.out.println("Enter the target value");
    target = sc.nextInt();
    
    int[] ar = new int[n];
    for(int i = 0; i<n; ++i){
      ar[i] = sc.nextInt();
    }
    Search obj = new Search();
    obj.binarySearch(ar, n, target);
   
  }
}