import java.util.Scanner;
public class vowelChecker {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = kb.next().charAt(0);

        if(Character.isLetter(ch)){
            char lowercase = Character.toLowerCase(ch);
            if(lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u'){
                System.out.print("Vowel");
            }
            else{
                System.out.println("Not a vowel");
            }
        }
    }
}
