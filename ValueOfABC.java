public class ValueOfABC {
    /*
    DECLARE A : INTEGER
    DECLARE B : INTEGER
    DECLARE C : INTEGER
    SET A = 7, B = 8;C = 9;
    IF(A^B^C)<(B+C+A)
            B = 6+A
    END IF 
      A=8^B
      PRINT A+B+C         
    */
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        int c = 9;
        if((a^b^c)<(b+c+a)){
            b = 6+a;
        }
        a = 8^b;
        System.out.println(a+b+c);
    }
}
