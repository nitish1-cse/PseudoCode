
import java.util.Scanner;

public class AreaAndCircum {
    /*
    DECLARE R: REAL
    DECLARE AREA: REAL
    DECLARE CIR: REAL
    CONSTANT PI = 3.14
    READ R
    AREA = PI*R*R
    CIR = 2*PI*R
    PRINT R
    */
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.14;

        double area = pi*r*r;
        System.out.println("The area is : " +area);

        double cir = 2*pi*r;
        System.out.println("The circumfrence is : "+cir);
    }
}
