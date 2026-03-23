public class IncrementOfXY {
    /*
    VALUE OF X,Y
    DECLARE X := INTEGER
    DECLARE Y := INTEGR
    INCREMENT X
    Y = X+Y
    INCREMENT Y 
    X = Y*2
    PRINT X,Y
    */
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        x++;
        y=x+y;
        y++;
        x = y*2;
        System.out.println("X = " +x+ " Y = " + y );

    }
}
