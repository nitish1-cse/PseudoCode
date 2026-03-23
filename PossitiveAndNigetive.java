import java.util.*;
public class PossitiveAndNigetive {
    /*
    DECLARE NUM : INTEGER
    READ NUM
    IF NUM < 0 THEN
            PRINT "NUM IS NIGETIVE!"
        ELSE 
           PRINT "NUM IS POSSITIVE"
    END IF           
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Num is nigetive");
        }else{
            System.out.println("Num is positive");
        }
    }
}
