
import java.util.Scanner;

public class ElseIf { 

    /*
    DECLAER X : INTEGER
    READ X 
    IF X >= 5 THEN
         PRINT "X IS GREATER THAN EQUAL TO 5"
       ELSE 
          PRINT "X IS LESS THAN 5"
    END IF        
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x >= 5){
            System.out.println("X is greater than equal to 5!");
        }else{
            System.out.println("X is less than 5!");
        }
    }
}
