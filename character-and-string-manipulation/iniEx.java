import java.util.*;
public class iniEx {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter fullname: ");
        String fullname = kb.nextLine();

        System.out.print("Enter student number: ");
        String studNum = kb.nextLine();

        String[] parts = fullname.split(" ");

        char firstInitial = Character.toUpperCase(parts[0].charAt(0));
        char secondInitial = Character.toUpperCase(parts[1].charAt(0));
        char lastInitial = Character.toUpperCase(parts[2].charAt(0));

        String surname = parts[2];

        String filename = firstInitial + "" + lastInitial + secondInitial + "_" + surname + "_" + studNum + ".zip";

        System.out.print("Filename: " + filename);


    }
}
