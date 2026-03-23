import java.util.Scanner;

public class NestedIf {

    /*
    DECLARE UID : STRING
    DECLARE PASS : STRING

    IF UID == "TIT" THEN
       IF PASS == "TIT" THEN 
                         PRINT "WELCOME"
        ELSE 
            PRINT "INVILED PASS"
        END IF
    ELSE 
       PRINT "INVILED UID"
    END IF                            
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uid = sc.next();
        String pass = sc.next();

        if(uid.equals("tit")){
            if(pass.equals("tit")){
                System.out.println("Welcome!");
            }else{
                System.out.println("Invaild pass!");
            }
        }else{
            System.out.println("Invaild uid!");
        }
    }
}
