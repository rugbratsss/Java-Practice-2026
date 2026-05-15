import java.util.*;
public class initialsExtractor {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your fullname: ");
        String fullname = kb.nextLine();

        System.out.print("Enter your student number: ");
        String studNumber = kb.nextLine();
        String[] parts = fullname.split(" ");

        char firstInitial = Character.toUpperCase(parts[0].charAt(0));
        char lastInitial = Character.toUpperCase(parts[1].charAt(0));

        String surname = parts[1];
        String filename = firstInitial + "" + lastInitial + surname + "_" + studNumber + ".zip";

        System.out.println("Filename: " + filename );

        System.out.println("Filename: " + firstInitial + lastInitial + surname +  "_" + studNumber + ".zip");
    }
}
