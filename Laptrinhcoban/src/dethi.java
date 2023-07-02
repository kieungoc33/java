
import java.math.BigDecimal;
import java.math.BigInteger;
public class dethi {
public static BigDecimal factorial(int n) {
    BigDecimal result = BigDecimal.valueOf(1);
    for (int i = 1; i <= n; i++) {
      result = result.multiply(BigDecimal.valueOf(i));
    }
    return result;
  }
  private static double power(double base, int exponent) {
    double result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= base;
    }
    return result;
  }
  public static double cos(double x) {
    double result = 0;
    for (int n = 0; n <= 10; n++) {
      double sign = (n % 2 == 0) ? 1 : -1;
      double term = sign * power(x, 2 * n) / factorial(2 * n).doubleValue();
      result += term;
    }
    return result;
  }
  public static double exp(double x) {
    double result = 0;
    for (int n = 0; n <= 10; n++) {
      double term = power(x, n) / factorial(n).doubleValue();
      result += term;
    }
    return result;
  }
  public static BigDecimal toDecimal(String number, int inRadix) {
    BigDecimal result = BigDecimal.valueOf(0);
    BigDecimal radix = BigDecimal.valueOf(inRadix);
    for (int i = 0; i < number.length(); i++) {
      char c = number.charAt(i);
      int digit = Character.digit(c, inRadix);
      BigDecimal value = BigDecimal.valueOf(digit);
      result = result.multiply(radix).add(value);
    }
    return result;
  }
  public static String decimalTo(String number, int outRadix) {
    BigDecimal decimal = new BigDecimal(number);
    StringBuilder result = new StringBuilder();
    while (decimal.compareTo(BigDecimal.ZERO) > 0) {
      BigDecimal[] quotientAndRemainder = decimal.divideAndRemainder(BigDecimal.valueOf(outRadix));
      int digit = quotientAndRemainder[1].intValue();
      char c = Character.forDigit(digit, outRadix);
      result.append(c);
      decimal = quotientAndRemainder[0];
    }
    return result.reverse().toString();
  }
  public static String toRadix(String number, int inRadix, int outRadix) {
    BigDecimal decimal = toDecimal(number, inRadix);
    String result= decimalTo(decimal.toString(), outRadix);
    return result;
  }
   
  public static void main(String[] args) {
    double x = 3.3;
    double e = 2.2;
    double result = e * dethi.cos(x);
    System.out.println("Result: " + result);
    
    String number = "123456789123456789";
    int inRadix = 13;
    int outRadix = 8;
    String converted = dethi.toRadix(number, inRadix, outRadix);
    System.out.println("Converted: " + converted);
  }

}

  