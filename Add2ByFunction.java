
import java.util.Scanner;

public class Add2ByFunction {
    /*
    FUNCTION add(a:INTEGER , b: INTEGER): INTEGER
              RETURN a+b
    END FUNCTION
    PRINT add(2,3)  
    
    ******************** PROCEDURE ************************

    PROCEDURE ADD(A:INTEGER , B:INTEGER):INTEGER
           PRINT A+B
    END PROCEDURE
    CALL ADD(2,3)       

    */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         System.out.println(Add(a, b));

         System.out.println("*********************** PROCEDURE *********************");
         int c = sc.nextInt();
         int d = sc.nextInt();
         add(c,d);
    }
    static int Add(int a , int b){
        return a+b;
    }

    static void add(int c , int d){
        int sum = c+d;
        System.out.println(sum);
    }


}
