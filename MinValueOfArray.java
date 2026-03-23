import java.util.Scanner;

public class MinValueOfArray {
    /*
    DECLARE a:aRRAY[5] OF INTEGER
    DECLARE MIN : INTEGER
    FOR i:=0 TO 4
          READ a[i]
    END FOR
    SET MIN := a[i]
    FOR i:= 0 TO 4
           IF a[i] < MIN THEN 
               MIN := a[i]
            END IF
    END FOR
    PRINT MIN        
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0; i<5; i++){
           arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0; i<5; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
