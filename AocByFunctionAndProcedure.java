
import java.util.Scanner;

public class AocByFunctionAndProcedure {
    /*
    FUNCTION aoc(rad:REAL):REAL
        RETURN 3.14*rad*rad
    END FUNCTION
    PRINT aoc(6.6)
    
    ********************************** PROCEDURE *******************************************

    PROCEDURE aoc(rad:REAL):REAL
         PRINT 3.14*rad*rad
    END PROCEDURE
    CALL aoc(4.4)     
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        System.out.println(aoc(rad));
        System.out.println("*********************** PROCEDURE ***********************");
        Double r = sc.nextDouble();
        Aoc(r);
    }
    static  double  aoc(double  rad){
        return 3.14*rad*rad;
    }
    // ***************************PROCEDURE****************************
    static void Aoc(double r){
        double ans = 3.14*r*r;
        System.out.println(ans);
    }
}
