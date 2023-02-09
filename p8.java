import java.util.*;

// Method overloading code

class HelperService {

	String formatNumber(int value) {
    return String.format("%d", value);
  }

 String formatNumber(double value) {
   return String.format("%.3f", value);
  }

  String formatNumber(String value) {
     return String.format("%.2f", Double.parseDouble(value));
  }
}
class p8{
  public static void main(String[] argc){
    HelperService hs = new HelperService();
    System.out.println(hs.formatNumber(500));
 	System.out.println(hs.formatNumber(89.9934));
    System.out.println(hs.formatNumber("550"));
  }
}