import java.util.*;
public class passwordVerify4 {
    public static boolean checkSpecial(String sPassword){

        int iSpecial = 0;

        for(int i = 0; i < sPassword.length(); i++){
            char ch = sPassword.charAt(i);

            if(Character.isUpperCase(ch)){
                iSpecial++;
            }
        }
        return iSpecial > 0;
    }
    public static boolean checkDigit(String sPassword){

        int iDigit = 0;

        for(int i = 0; i < sPassword.length(); i++){
            char ch = sPassword.charAt(i);

            if(Character.isUpperCase(ch)){
                iDigit++;
            }
        }
        return iDigit > 0;
    }
    public static boolean checkLower(String sPassword){

        int iLower = 0;

        for(int i = 0; i < sPassword.length(); i++){
            char ch = sPassword.charAt(i);

            if(Character.isUpperCase(ch)){
                iLower++;
            }
        }
        return iLower > 0;
    }
    public static boolean checkUpper(String sPassword){

        int iUpper = 0;

        for(int i = 0; i < sPassword.length(); i++){
            char ch = sPassword.charAt(i);

            if(Character.isUpperCase(ch)){
                iUpper++;
            }
        }
        return iUpper > 0;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        String password;

        System.out.print("Enter your password: ");
        password = kb.nextLine();

        if(password.length() < 8){
            System.out.println("Enter atleast 8 digits!");
        }
        else{
            boolean valid = checkUpper(password) && checkLower(password) && checkDigit(password) && checkSpecial(password);

            if(valid){
                System.out.println("Password is strong!");
            }
            else{
                if(!checkUpper(password)) System.out.println("No upper case!");
                if(!checkLower(password)) System.out.println("No lower case!");
                if(!checkDigit(password)) System.out.println("No digits!");
                if(!checkSpecial(password)) System.out.println("No special case!");
            }
        }
    }
}
