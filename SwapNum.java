
import java.util.Scanner;

public class SwapNum{
    /*1)Method without using third variable
    DECLARE A: INTEGER
    DECLARE B: INTEGER
    READ A
    READ B
    A = A^B
    B = A^B
    A = A^B
    PRINT A , B
   ****************2ND***************** 
    2) Method using third variable 
    DECLARE A: INTEGER
    DECLARE B: INTEGER
    DECLARE TEMP: INTEGER
    READ A
    READ B
    TEMP = A
    A = B
    B = TEMP
    PRINT A,B
    */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("A = ");
    int a = sc.nextInt();
    System.out.print("B = ");
    int b = sc.nextInt();
    a = a^b;
    b = a^b;
    a = a^b;
    System.out.println("After Swap : " + a + " " +b);
    
    }
}