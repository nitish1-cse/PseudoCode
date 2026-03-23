

public class Divisible {

    public static void main(String[] args) {
        int n = 42;
        // System.out.println(BitCounter(n));
        int a = 4;
        int b = 8;
        int c = 57;
        System.out.println(funn(a,b,c));
    }
    //   static int BitCounter(int num){
    //     int count = 0;
        
    //     while(num > 0){
    //         count  = count+(num % 2);
    //         num = num/2;
    //     }
    //     return count;
    // } 



    static int  funn(int a, int b, int c){
        b = (a^11)&b;//
        for( c = 3 ; c<=6; c++){
            b = 3+c;
            if(1<b || (a&c)<(5-a)){
                a = (c+2)+c;
                b = c+c;
                break;
            }   
        }
        return a+b;
    }

}
