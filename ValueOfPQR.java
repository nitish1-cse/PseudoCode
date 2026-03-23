import java.util.Scanner;

public class ValueOfPQR {
    /*
    DECLARE PP:INTEGER
    DECLARE QQ:INTEGER
    DECLARE RR:INTEGER
    SET PP=2,QQ=9,RR=5
    PP=(PP&RR)+PP
    RR = RR+RR
    RR=(RR+RR)&RR
    PRINT PP+QQ+RR
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pp =2;
        int qq =9;
        int rr =5;
        pp = (pp&rr)+pp;
        rr = rr+rr;
        rr = (rr+rr)&rr;
        System.out.println(pp+qq+rr);
    }
}
