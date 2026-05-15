import java.util.*;

public class PasswordVerify3{
    public static boolean checkSpecial(String sPassword){
        int iSpecial = 0;

        for(int i = 0; i < sPassword.length(); i++){
            char ch = sPassword.charAt(i);

            if(!Character.isLetterOrDigit(ch)){
                iSpecial++;
            }
        }
        return iSpecial > 0;
    }
    public static boolean checkDigit(String sPassword){
        int iDigit = 0;

        for(int i = 0; i < sPassword.length(); i++){
            char ch = sPassword.charAt(i);

            if(Character.isDigit(ch)){
                iDigit++;
            }
        }
        return iDigit > 0;
    }
    public static boolean checkLower(String sPassword){
        int iLower = 0;

        for(int i = 0; i < sPassword.length(); i++){
            char ch = sPassword.charAt(i);

            if(Character.isLowerCase(ch)){
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
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);

        String sPassword;

        System.out.print("Enter your password: ");
        sPassword = kb.nextLine();

        if(sPassword.length() < 8){
            System.out.print("Enter atleast 8 digits!");
        }
        else{
            boolean valid = checkUpper(sPassword) && checkLower(sPassword) && checkDigit(sPassword) && checkSpecial(sPassword);
                if(valid){
                System.out.println("Password is strong!");
            }
            else{
                if(!checkUpper(sPassword)) System.out.println("No upper case");
                if(!checkLower(sPassword)) System.out.println("No Lower case");
                if(!checkDigit(sPassword)) System.out.println("No Digit");
                if(!checkSpecial(sPassword)) System.out.println("No special case");
            }
        }

        
    }
}
