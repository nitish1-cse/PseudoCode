

public class ValueOfXY{
    /*
    VALUE OF X , Y

    DECLARE X := INTEGER
    DECLARE Y := INTEGER
    SET X = 4 , Y = 6
    X = X+Y
    Y = X-2
    X = Y*3
    Y = X+Y
    PRINT X , Y
    */
    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        x = x+y;
        y = x-2;
        x = y*3;
        y = x+y;

        System.out.println("X = " + x + " Y = " +y);
    }
}