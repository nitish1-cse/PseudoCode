public class BinaryAddAndSub {
    public static void main(String[] args) {
        String a = "1011";
        String b = "1101";
        int num1 = Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int sum = num1+num2;
        String result = Integer.toBinaryString(sum);
        System.out.println("Binary1 :" + a);
        System.out.println("Binary2 :" + b);
        System.out.println("Binary Addition : " + result);

        System.out.println("******************SUBTRACTION***********************");
        
        String c = "1010";
        String d = "0011";
        int num3 = Integer.parseInt(c,2);
        int num4 = Integer.parseInt(d,2);
        int sub = num3 - num4;
        String result1 = Integer.toBinaryString(sub);
        System.out.println("Binary1 : "+c);
        System.out.println("Binary2 : "+d);
        System.out.println("Binary Subtraction : "+result1);

    }
}
