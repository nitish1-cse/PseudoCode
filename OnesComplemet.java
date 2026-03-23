public class OnesComplemet {
    public static void main(String[] args) {
         String binary = "1010";
        String result = "";

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0')
                result += "1";
            else
                result += "0";
        }

        System.out.println("Binary: " + binary);
        System.out.println("1's Complement: " + result);
    }   
}
