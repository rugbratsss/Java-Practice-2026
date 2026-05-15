import java.util.Scanner;

public class UsernamePassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input (Username#password): ");
        String input = sc.nextLine();

        if (!isValidInput(input)) {
            System.out.println("Invalid input: must contain '#'");
            return;
        }

        int hashIndex = input.indexOf("#");
        String username = input.substring(0, hashIndex);
        String password = input.substring(hashIndex + 1);

        System.out.println("Uppercase Username : " + getUpperUsername(username));
        System.out.println("Length of Username : " + getUsernameLength(username));
        System.out.println("Valid input        : " + isValidInput(input));
        System.out.println("First 4 of Password: " + getFirstFour(password));

        sc.close();
    }

    public static boolean isValidInput(String input) {
        return input.contains("#");
    }

    public static String getUpperUsername(String username) {
        return username.toUpperCase();
    }

    public static int getUsernameLength(String username) {
        return username.toUpperCase().length();
    }

    public static String getFirstFour(String password) {
        if (password.length() >= 4) {
            return password.substring(0, 4);
        }
        return password + " (less than 4 chars)";
    }
}
