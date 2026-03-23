
import java.util.Scanner;

public class OneD_Array {
    /*
    DECLARE a:ARRAY[5] OF INTEGER // DECLARE a: ARRAY[0:4] OF INTEGER
    FOR i := 0 TO 4
         READ a[i]
    END FOR
    FOR i:= 0TO 4
          PRINT a[i]
    END FOR      
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
