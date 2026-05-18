public class NotepadApp {

    // Fields
    private String title;
    private String content;

    // Parallel arrays to store saved documents (max 50)
    private String[] titles   = new String[50];
    private String[] contents = new String[50];
    private int count = 0; // tracks how many documents are saved

    // Constructor
    public NotepadApp() {
        title   = "";
        content = "";
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    // Save the current title and content into the arrays
    public void saveDocument() {
        if (count < 50) {
            titles[count]   = title;
            contents[count] = content;
            count++;
            System.out.println("\n Document \"" + title + "\" saved successfully!");
        } else {
            System.out.println("\n Notepad is full. Cannot save more documents.");
        }
    }

    // View all saved document titles
    public void viewAllDocuments() {
        if (count == 0) {
            System.out.println("\n No documents saved yet.");
        } else {
            System.out.println("\n===== SAVED DOCUMENTS =====");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + titles[i]);
            }
            System.out.println("===========================");
        }
    }

    // View a specific document by its number
    public void viewDocument(int index) {
        if (index < 1 || index > count) {
            System.out.println("\n Invalid document number.");
        } else {
            System.out.println("\n========== DOCUMENT ==========");
            System.out.println("Title   : " + titles[index - 1]);
            System.out.println("Content : " + contents[index - 1]);
            System.out.println("==============================");
        }
    }

    // Return total number of saved documents
    public int getTotalDocuments() {
        return count;
    }
}
