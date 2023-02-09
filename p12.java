import java.util.*;

class Solution {
    public boolean isHappy(int n) {
	
        int slow = n;
        int fast = n;
		
		do {
			slow = HappyNumber(slow);
      fast = HappyNumber(HappyNumber(fast));
		} while (slow != fast);
		
		if (slow == 1) {
			return true;
		}
		return false;
	}
	static int HappyNumber(int N) {

		int sum = 0;
		while (N > 0) {
			int Rem = N % 10;
			N /= 10;
			sum += (Rem * Rem);
		}
    return sum;
	}
}

class p12{
  public static void main(String[] args){
    Solution obj = new Solution();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean Happy = obj.isHappy(n);
    if(Happy) System.out.println("Happy number");
    else System.out.println("Not Happy number");
  }
}