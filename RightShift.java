public class RightShift {
    /*
    DECLARE X := INTEGER
    SET X = 18
    0 0 0 1 0 0 1 0
    X : X >> 1
    0 0 1 0 0 1 0 0  : X = 36
    
    */
    public static void main(String[] args) {

        int num = 18;

        int result = num >> 1;

        System.out.println("Number: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Right Shift Result: " + result);
        System.out.println("Binary Result: " + Integer.toBinaryString(result));
    }
}
