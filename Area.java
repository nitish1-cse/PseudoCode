

import java.util.*;

public class Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();

        int area = 2 * b * h;
        System.out.println("The area is : " + area);

        int peri = b * h;
        System.out.println("The perimeter is : " + peri);
    }
}

/*
DECLARE B: REAL
DECLARE H: REAL
DECLARE Area: REAL
DECLARE Peri: REAL

READ A
READ B

AREA := 2*B*H
PERI := B*H

 */
