import java.util.Scanner;

public class ReverseNum {
/*
DECLARE NUM := INTEGER
DECLARE REV := INTEGER
DECLARE REM := INTEGER
READ NUM
SET REV = 0

WHILE NUM > 0
    REM = NUM % 10
    REV = REV * 10 + REM
    NUM = NUM / 10
END WHILE
PRINT REV
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;

        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
