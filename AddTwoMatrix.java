
import java.util.Scanner;

public class AddTwoMatrix {
    /*
    DECLARE X: ARRAY[3][3] OF INTEGER
    DECLARE Y: ARRAY[3][3] OF INTEGER
    DECLARE Z: ARRAY[3][3] OF INTEGER
    
    FOR r:=0 TO 2
        FOR c:=0 TO 2
           READ X[r][c]
           READ Y[r][c]
        END FOR
    END FOR
    
    FOR r:=0 TO 2
        FOR c:=0 TO 2
            Z[r][c] = X[r][c] + Y[r][c]
        END FOR
    END FOR
    
    FOR r:=0 TO 2
        FOR c:=0 TO 2
           PRINT Z[r][c]
        END FOR   
    END FOR   
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int result[][] = new int[3][3];

        for(int r = 0; r<3; r++){
            for(int c=0; c<3; c++){
                arr1[r][c] = sc.nextInt();
                arr2[r][c] = sc.nextInt();
            }
        }
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                result[r][c] = arr1[r][c] + arr2[r][c];
            }
        }
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                System.out.print(result[r][c]+ " ");
            }
            System.out.println();
        }
    }
}
