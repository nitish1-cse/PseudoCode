
import java.util.Scanner;

public class SumOfElementIn1D {
    /*
    DECLARE a: ARRAY[5] OF INTEGER
    DECLARE SUM : INTEGER
    SET SUM = 0
    FOR i:=0 TO 4
         READ a[i]
    END FOR
    FOR i:= 0 TO 4
         SUM+=a[i]
    END FOR
    PRINT SUM          
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arr[] = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
