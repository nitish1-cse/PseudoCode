import java.util.Scanner;

public class ArmStrong {
/* 
DECLARE NUM := INTEGER
DECLARE TEMP := INTEGER
DECLARE REM := INTEGER
DECLARE SUM := INTEGER
READ NUM
SET TEMP = NUM
SET SUM = 0

WHILE NUM > 0
    REM = NUM % 10
    SUM = SUM + (REM * REM * REM)
    NUM = NUM / 10
END WHILE

IF TEMP = SUM THEN
    PRINT "ARMSTRONG NUMBER"
ELSE
    PRINT "NOT ARMSTRONG NUMBER"
END IF
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while(num > 0){
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }

        if(temp == sum){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
