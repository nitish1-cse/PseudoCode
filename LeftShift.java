public class LeftShift {
    /*
    X = 18
    0 0 0 1 0 0 1 0
    X : X << 1
    0 0 1 0 0 1 0 0  := 36
    */
    public static void main(String[] args) {
        int num = 6;

        int result = num << 1;

        System.out.println("Number: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Left Shift Result: " + result);
        System.out.println("Binary Result: " + Integer.toBinaryString(result));
        
    }
}
