import java.util.Scanner;

public class Coordinate {
/*
DECLARE X := INTEGER
DECLARE Y := INTEGER

READ X, Y

IF X > 0 THEN
    IF Y > 0 THEN
        PRINT "QUADRANT I"
    ELSE IF Y < 0 THEN
        PRINT "QUADRANT IV"
    ELSE
        PRINT "ON X-AXIS"
    END IF

ELSE IF X < 0 THEN
    IF Y > 0 THEN
        PRINT "QUADRANT II"
    ELSE IF Y < 0 THEN
        PRINT "QUADRANT III"
    ELSE
        PRINT "ON X-AXIS"
    END IF

ELSE
    IF Y = 0 THEN
        PRINT "ORIGIN"
    ELSE
        PRINT "ON Y-AXIS"
    END IF
END IF
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0){
            if(y > 0){
                System.out.println("Quadrant I");
            } else if(y < 0){
                System.out.println("Quadrant IV");
            } else {
                System.out.println("On X-axis");
            }
        }
        else if(x < 0){
            if(y > 0){
                System.out.println("Quadrant II");
            } else if(y < 0){
                System.out.println("Quadrant III");
            } else {
                System.out.println("On X-axis");
            }
        }
        else {
            if(y == 0){
                System.out.println("Origin");
            } else {
                System.out.println("On Y-axis");
            }
        }
    }
}
