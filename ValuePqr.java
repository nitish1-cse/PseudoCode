public class ValuePqr {
    /*
    DECLARE P : INTEGER
    DECLARE Q : INTEGER
    DECLARE R : INTEGER
    SET P=4,Q=2,R=8
    FOR EACH R FROM 5 TO 6
              P = (R+R)^R
              Q = (8+3)+P
    END FOR
    FOR EACH R FROM 5 TO 8
              P = 4+R
              P = 1+Q
    END FOR
    PRINT Q+P                    
    */
    public static void main(String[] args) {
        int p = 4;
        int q = 2;
        int r = 8;

        for(r=5; r<=6; r++){
            p = (r+r)^r;
            q = (8+3)+p;
        }
        for(r = 5; r<=8; r++){
            p = 4+r;
            p = 1+q;
        }
        System.out.println(p+q);
    }
}
