public class BinaryAB {
    /*
    DECLARE A: INTEGER
    DECLARE B: INTEGER
    SET A := 1 , B := 1
    A = (A^1)&(1)+(B^1)&1
    PRINT A 
    OUTPUT := 0 0 0 0
    */
    public static void main(String[] args) {
         int a = 1;
        int b = 1;

        a = ((a ^ 1) & 1) + ((b ^ 1) & 1);

        String binary = String.format("%4s",
         Integer.toBinaryString(a)).replace(' ', '0');

        System.out.println("Decimal value: " + a);
        System.out.println("4-bit Binary: " + binary);
    }
    
}
