
import java.util.Scanner;

public class MaxValueOfArray {
    /*
    DECLARE a:ARRAY[5] OF INTEGER
    DECLARE max = : INTEGER
    FOR i:=0 TO 4
    READ a[i]
    END FOR
    SET max :=a[0]
    FOR i:=0 TO 4
    IF a[i] > max THEN
              max := a[i]
        END IF
    END FOR
    PRINT max          
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<5; i++){
            if(arr[i] > max){
                max = arr[i];
            } 
        }
        System.out.println(max);
    }
}
