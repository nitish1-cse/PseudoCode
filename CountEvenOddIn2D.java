import java.util.Scanner;

public class CountEvenOddIn2D {
    /*
    DECLARE X: ARRAY[3][3] OF INTEGER
    DECLARE EVEN : INTEGER
    DECLARE ODD : INTEGER
    SET EVEN = 0
    SET ODD = 0
    
    FOR r:=0 TO 2
        FOR c:=0 TO 2
           READ X[r][c]
        END FOR   
    END FOR
    
    FOR r:=0 TO 2
        FOR c:=0 TO 2
            IF X[r][c] MOD 2 = 0 THEN
                    EVEN++
            ELSE 
               ODD++
            END IF
        END FOR
    END FOR
    PRINT EVEN
    PRINT                   
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int even = 0;
        int odd = 0;

        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                if(arr[r][c] % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.println("Even := " + even);
        System.out.println("Odd := " + odd);
    }
}
