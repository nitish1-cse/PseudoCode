
import java.util.Scanner;

public class TwoDArray {
    /*
    DECLARE X: ARRAY[2][2] OF INTEGER
    FOR r:= 0 TO 1
        FOR c := 0 TO 1
            READ X[R][C]
        END FOR
    END FOR
    
    FOR r:= 0 TO 1
        FOR C:= 0 TO 1
             PRINT X[R][C]
        END FOR
    END FOR         
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        for(int r=0; r<2; r++){
            for(int c = 0; c<2; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        for(int r=0; r<2; r++){
            for(int c = 0; c <2; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
}
