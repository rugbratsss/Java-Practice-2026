import java.util.Scanner;

public class TestChemicalDatabase {

    public static void main(String[] args) {

        ChemicalDatabase db = new ChemicalDatabase();
        Scanner sc = new Scanner(System.in);

        System.out.println("Which table do you want to search?");
        System.out.println("1 - Elements");
        System.out.println("2 - Compounds");
        System.out.println("3 - Compound Element Details");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter search value: ");
        String query = sc.nextLine();

        if (choice == 1) {
            db.searchElement(query);
        } else if (choice == 2) {
            db.searchCompound(query);
        } else if (choice == 3) {
            db.searchDetails(query);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
