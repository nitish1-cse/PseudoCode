
import java.util.Scanner;

public class IfElseLadder {

    /*
    DECLARE X : INTEGER
    READ X
    IF X > 0 THEN 
                PRINT "POSITIVE"
           ELSE IF X < 0
                     PRINT "NIGETIVE"
            ELSE 
              PRINT "ZERO"
        END IF                     
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x > 0){
            System.out.println("Positive");
        }else if(x < 0){
            System.out.println("Nigetive");
        }else{
            System.out.println("Zero");
        }
    }
}
