import java.util.Scanner;

public class SumOf2DArray {
    /*
    DECLARE X: ARRAY[2][2] OF INTEGER
    DECLARE SUM : INTEGER 
    SET SUM = 0
    FOR r:=0 TO 1
        FOR C:=0 TO 1
            READ X[r][c]
        END FOR
    END FOR
    FOR r:=0 TO 1
        FOR c:= 0 TO 1
           SUM += X[r][c]
        END FOR
    END FOR
    PRINT SUM               
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        int sum = 0;
        for(int r=0; r<2; r++){
            for(int c=0; c<2; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        for(int r=0; r<2; r++){
            for(int c=0; c<2; c++){
                sum+=arr[r][c];
            }
        }
        System.out.println(sum);
    }
}
