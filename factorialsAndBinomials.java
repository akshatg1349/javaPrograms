import java.math.BigInteger;

public class factorialsAndBinomials {

  static int myPower(int a, int n) {
  int result = 1;
    for (int i = 1; i <= n; i++) {
    result = result * a;
    }
    return result;
  }
 
  static int myFact(int num) {
  int fact = 1;
    for (int i = 1; i <= num; i++) {
    fact *= i;
    }
    return fact;
  }
  static int myBinomial(int x, int y, int n) {
  int result = 0;
    for (int k = 0; k <= n; k++) {
      int ak = myFact(n) / (myFact(n-k) * myFact(k));
      int xTerm = myPower(x, n-k);
      int yTerm = myPower(y, k);
      int term = ak * xTerm * yTerm;
      result += term;
    }
    return result;
  }
  public static void main(String[] args) {
    int binomialValue = myBinomial(1, 1, 10);
    System.out.println(binomialValue);
  }
}