public class DecrementOfXY {
    /*
    VALUE OF X,Y
    DECLARE X := INTEGER
    DECLARE Y := INTEGER
    SET X = 1,Y=3
    DECREMENT X
    Y = X+Y 
    DECREMENT Y
    X = Y+X
    */
    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        x--;
        y = x+y;
        y--;
        x = y+x;
        System.out.println("X = " +x+ " Y = " +y);
    }
}
