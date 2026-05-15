import java.util.*;
public class capitalized {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = kb.nextLine();

        String[] words = sentence.split(" ");
        String results = "";

        for(int i = 0; i < words.length; i++ ){
            results += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
            if(i < words.length - 1){
                results += " ";
            }
        }

        System.out.println("Capitalized: " + results);
    }
}
