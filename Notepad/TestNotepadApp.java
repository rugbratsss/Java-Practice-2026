import java.util.Scanner;

public class TestNotepadApp {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        NotepadApp notepad = new NotepadApp();
        int choice = 0;

        System.out.println("=============================");
        System.out.println("   Welcome to MJO Notepad   ");
        System.out.println("=============================");

        while (choice != 4) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Write a new document");
            System.out.println("2. View all saved documents");
            System.out.println("3. Open a saved document");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = kb.nextInt();
            kb.nextLine(); // consume newline

            if(choice == 1) {

                System.out.print("\nEnter document title: ");
                String title = kb.nextLine();

                System.out.print("Enter document content: ");
                String content = kb.nextLine();

                notepad.setTitle(title);
                notepad.setContent(content);
                notepad.saveDocument();

            } else if (choice == 2) {

                notepad.viewAllDocuments();

            } else if (choice == 3) {

                notepad.viewAllDocuments();

                if (notepad.getTotalDocuments() > 0) {
                    System.out.print("\nEnter document number to open: ");
                    int num = kb.nextInt();
                    kb.nextLine();
                    notepad.viewDocument(num);
                }

            } else if (choice == 4) {

                System.out.println("\nGoodbye! " + notepad.getTotalDocuments()
                        + " document(s) were saved this session.");

            } else {

                System.out.println("\nInvalid option. Please try again.");
            }
        }

        kb.close();
    }
}
