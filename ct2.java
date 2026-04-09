import java.util.*;
public class ct2 {
    public static boolean hasCorrectLength(String password){
        return password.length() >= 8;
    }
    public static boolean hasUpperCase(String password){
        int uCount = 0;
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if(Character.isUpperCase(ch)){
                uCount++;
            }
        }
        return uCount > 0;
    }
    public static boolean hasLowerCase(String password){
        int lCount = 0;
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if(Character.isLowerCase(ch)){
                lCount++;
            }
        }
        return lCount > 0;
    }
    public static boolean hasDigit(String password){
        int dCount = 0;
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if(Character.isDigit(ch)){
                dCount++;
            }
        }
        return dCount > 0;
    }
    public static boolean hasSpecialCharacter(String password){
        int sCount = 0;
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if(!Character.isLetterOrDigit(ch)){
                sCount++;
            }
        }
        return sCount > 0;
    }
    public static boolean isStrongPassword(String password){
        return hasCorrectLength(password) && hasUpperCase(password) && hasLowerCase(password) && hasDigit(password) && hasSpecialCharacter(password);
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = kb.nextLine();

        boolean strong = hasCorrectLength(password) && hasUpperCase(password) && hasLowerCase(password) && hasDigit(password) && hasSpecialCharacter(password); 

        System.out.println("Correct length: " + hasCorrectLength(password));
        System.out.println("Has uppercase:  " + hasUpperCase(password));
        System.out.println("Has lowercase:  " + hasLowerCase(password));
        System.out.println("Has digit:      " + hasDigit(password));
        System.out.println("Has special:    " + hasSpecialCharacter(password));


        System.out.println("Strong password: " + strong);
    }
}
