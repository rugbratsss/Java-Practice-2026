import java.util.*;
public class PasswrdVerify2{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        String password;

        int iLower = 0;
        int iUpper = 0;
        int iDigit = 0;
        int iSpecial = 0;

        System.out.print("Enter your password: ");
        password = kb.nextLine();

        if(password.length() < 8){
            System.out.print("Enter atleast 8 digits!");
        }
        else{
            for(int i = 0; i < password.length(); i++){
                char ch = password.charAt(i);

                if(Character.isUpperCase(ch))
                    iUpper++;
                else if(Character.isLowerCase(ch))
                    iLower++;
                else if(Character.isDigit(ch))
                    iDigit++;
                else if(!Character.isLetterOrDigit(ch))
                    iSpecial++;
            }
            if(iUpper >= 1 && iLower >= 1 && iDigit >= 1 && iSpecial >= 1){
                System.out.println("Granted!");
            }
            else{
                System.out.println("Not granted!");

                if(iUpper == 0) System.out.println("Upper is missing!");
                if(iLower == 0) System.out.println("lower is missing!");
                if(iDigit == 0) System.out.println("Digit is missing!");
                if(iSpecial == 0) System.out.println("Special is missing!");
            }
            
        }
    }
}