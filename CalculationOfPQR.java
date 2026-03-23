public class CalculationOfPQR {
    /*
    VALUE OF P,Q,R
    DECLARE P := INTEGER
    DECLARE Q := INTEGER
    DECLARE R := INTEGER
    SET P = 8, Q = 3, R = 2
    P = P+Q
    Q = P*R
    P = Q-4
    R = P+Q
    */
    public static void main(String[] args) {
      int p = 8;  
      int q = 3;  
      int r = 2;
      
      p = p+q;
      q = p*r;
      p = q-4;
      r = p+q;
      System.out.println("P = " + p + " Q = " + q + " R = " + r);
    }
}
