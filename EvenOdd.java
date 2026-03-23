
import java.util.Scanner;

public class EvenOdd {
    /*
    DECLARE NUM:INTEGER
    READ NUM
    IF NUM MOD 2 == 0 THEN 
              PRINT "EVEN"
        ELSE 
           PRINT "ODD"
    END IF             
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
