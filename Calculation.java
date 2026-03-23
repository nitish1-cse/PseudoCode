
import java.util.Scanner;

public class Calculation {
    /*
    VALUE OF A,B,C
    DECLARE A := INTEGER
    DECLARE B := INTEGER
    DECLARE C := INTEGER
    A = 2
    B = 4
    C = 6
    A = B+C
    B = A*2
    C = B-A
    A = C+B
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 4;
        int c = 6;
        a = b+c;
        b = a*2;
        c = b-a;
        a = c+b;

        System.out.println("A = " + a + " B = " + b + " C = "+c );
    }
}
