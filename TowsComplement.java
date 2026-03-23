public class TowsComplement {
     public static void main(String[] args) {

        String binary = "0110";

        int num = Integer.parseInt(binary, 2);
        int twos = (~num) + 1;

        String result = Integer.toBinaryString(twos);

        System.out.println("Binary: " + binary);
        System.out.println("2's Complement: " + result);
    }
}
