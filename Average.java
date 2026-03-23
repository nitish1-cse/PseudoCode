
import java.util.Scanner;

public class Average {
    /*
    DECLARE A:INTEGER
    DECLARE B:INTEGER
    DECLARE C:INTEGER
    DECLARE AVG:INTEGER

    READ A,B,C
    AVG = (A+B+C)/3
    PRINT AVG
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("The average is : " + avg);
    }
}
