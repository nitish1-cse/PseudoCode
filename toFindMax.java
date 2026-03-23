
import java.util.Scanner;

public class toFindMax {
    /*
    TO FIND MAX VALUE
    FUNCTION max(a:INTEGER , b:INTEGER) : INTEGER
        DECLARE c:INTEGER
          IF a>b THEN
             c:=a
            ELSE
              c:=b
        END IF
          RETURN c
    END FUNCTION
        PRINT max(23,5)          
     
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The max is : " +max(a, b));
    }
    static int max(int a , int b){
        int temp;
        if(a > b){
            temp = a;
        }else{
            temp = b;
        }
        return temp;
    }
}
