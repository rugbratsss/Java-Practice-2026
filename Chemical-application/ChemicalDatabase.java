public class ChemicalDatabase {

    // 2D array: { elementSymbol, elementName }
    private String[][] elements;
    private int        elementCount;

    // 2D array: { compoundId, compoundName }
    private String[][] compounds;
    private int        compoundCount;

    // 2D array: { compoundId, elementSymbol, numberOfAtoms }
    private String[][] details;
    private int        detailCount;


    public ChemicalDatabase() {
        elements = new String[][] {
            {"H",  "Hydrogen"},
            {"C",  "Carbon"},
            {"N",  "Nitrogen"},
            {"O",  "Oxygen"},
            {"Na", "Sodium"},
            {"Cl", "Chlorine"},
            {"He", "Helium"}
        };
        elementCount = elements.length;

        compounds = new String[][] {
            {"100", "Water"},
            {"101", "Carbon Dioxide"},
            {"102", "Ammonia"},
            {"103", "Table Salt"},
            {"104", "Mystery Compound"}
        };
        compoundCount = compounds.length;

        details = new String[][] {
            {"100", "H",  "2"},
            {"100", "O",  "1"},
            {"101", "C",  "1"},
            {"101", "O",  "2"},
            {"102", "N",  "1"},
            {"102", "H",  "3"},
            {"103", "Na", "1"},
            {"103", "Cl", "1"},
            {"104", "Q",  "2"},
            {"104", "X",  "1"}
        };
        detailCount = details.length;
    }


    // ----------------------------------------------------------------
    //  DISPLAY METHODS
    // ----------------------------------------------------------------

    public void displayElements() {
        System.out.println("\n--- Elements ---");
        System.out.printf("%-10s %-15s%n", "Symbol", "Name");
        System.out.println("-------------------------");
        for (int i = 0; i < elementCount; i++) {
            System.out.printf("%-10s %-15s%n", elements[i][0], elements[i][1]);
        }
    }

    public void displayCompounds() {
        System.out.println("\n--- Compounds ---");
        System.out.printf("%-15s %-20s%n", "Compound ID", "Name");
        System.out.println("-----------------------------------");
        for (int i = 0; i < compoundCount; i++) {
            System.out.printf("%-15s %-20s%n", compounds[i][0], compounds[i][1]);
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Compound Element Details ---");
        System.out.printf("%-15s %-15s %-15s%n", "Compound ID", "Element", "Atoms");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < detailCount; i++) {
            System.out.printf("%-15s %-15s %-15s%n", details[i][0], details[i][1], details[i][2]);
        }
    }


    // ----------------------------------------------------------------
    //  SEARCH METHODS
    // ----------------------------------------------------------------

    public void searchElementBySymbol(String symbol) {
        System.out.println("\nSearching element by symbol: " + symbol);
        for (int i = 0; i < elementCount; i++) {
            if (elements[i][0].equalsIgnoreCase(symbol)) {
                System.out.println("Found: " + elements[i][0] + " = " + elements[i][1]);
                return;
            }
        }
        System.out.println("Element '" + symbol + "' not found.");
    }

    public void searchCompoundById(String id) {
        System.out.println("\nSearching compound by ID: " + id);
        for (int i = 0; i < compoundCount; i++) {
            if (compounds[i][0].equals(id)) {
                System.out.println("Found: ID=" + compounds[i][0] + "  Name=" + compounds[i][1]);
                return;
            }
        }
        System.out.println("Compound ID '" + id + "' not found.");
    }

    public void searchDetailsByCompoundId(String id) {
        System.out.println("\nElements in Compound ID " + id + ":");
        boolean found = false;
        for (int i = 0; i < detailCount; i++) {
            if (details[i][0].equals(id)) {
                System.out.println("  Element: " + details[i][1] + "  Atoms: " + details[i][2]);
                found = true;
            }
        }
        if (!found) System.out.println("  No records found.");
    }

    public void searchDetailsByElement(String symbol) {
        System.out.println("\nCompounds containing element '" + symbol + "':");
        boolean found = false;
        for (int i = 0; i < detailCount; i++) {
            if (details[i][1].equalsIgnoreCase(symbol)) {
                System.out.println("  Compound ID: " + details[i][0] + "  Atoms: " + details[i][2]);
                found = true;
            }
        }
        if (!found) System.out.println("  Not found in any compound.");
    }


    // ----------------------------------------------------------------
    //  SORT METHODS (Bubble Sort)
    // ----------------------------------------------------------------

    public void sortElementsBySymbol() {
        for (int i = 0; i < elementCount - 1; i++) {
            for (int j = 0; j < elementCount - 1 - i; j++) {
                if (elements[j][0].compareToIgnoreCase(elements[j + 1][0]) > 0) {
                    String[] temp      = elements[j];
                    elements[j]        = elements[j + 1];
                    elements[j + 1]    = temp;
                }
            }
        }
        System.out.println("\nElements sorted by Symbol (A-Z):");
        displayElements();
    }

    public void sortElementsByName() {
        for (int i = 0; i < elementCount - 1; i++) {
            for (int j = 0; j < elementCount - 1 - i; j++) {
                if (elements[j][1].compareToIgnoreCase(elements[j + 1][1]) > 0) {
                    String[] temp      = elements[j];
                    elements[j]        = elements[j + 1];
                    elements[j + 1]    = temp;
                }
            }
        }
        System.out.println("\nElements sorted by Name (A-Z):");
        displayElements();
    }

    public void sortCompoundsById() {
        for (int i = 0; i < compoundCount - 1; i++) {
            for (int j = 0; j < compoundCount - 1 - i; j++) {
                if (Integer.parseInt(compounds[j][0]) > Integer.parseInt(compounds[j + 1][0])) {
                    String[] temp       = compounds[j];
                    compounds[j]        = compounds[j + 1];
                    compounds[j + 1]    = temp;
                }
            }
        }
        System.out.println("\nCompounds sorted by ID (ascending):");
        displayCompounds();
    }

    public void sortCompoundsByName() {
        for (int i = 0; i < compoundCount - 1; i++) {
            for (int j = 0; j < compoundCount - 1 - i; j++) {
                if (compounds[j][1].compareToIgnoreCase(compounds[j + 1][1]) > 0) {
                    String[] temp       = compounds[j];
                    compounds[j]        = compounds[j + 1];
                    compounds[j + 1]    = temp;
                }
            }
        }
        System.out.println("\nCompounds sorted by Name (A-Z):");
        displayCompounds();
    }

    public void sortDetailsByAtoms() {
        for (int i = 0; i < detailCount - 1; i++) {
            for (int j = 0; j < detailCount - 1 - i; j++) {
                if (Integer.parseInt(details[j][2]) < Integer.parseInt(details[j + 1][2])) {
                    String[] temp    = details[j];
                    details[j]       = details[j + 1];
                    details[j + 1]   = temp;
                }
            }
        }
        System.out.println("\nDetails sorted by Number of Atoms (descending):");
        displayDetails();
    }


    // ----------------------------------------------------------------
    //  UTILITY METHODS
    // ----------------------------------------------------------------

    public int totalAtomsInCompound(String id) {
        int total = 0;
        for (int i = 0; i < detailCount; i++) {
            if (details[i][0].equals(id)) {
                total += Integer.parseInt(details[i][2]);
            }
        }
        return total;
    }

    public int countElementsInCompound(String id) {
        int count = 0;
        for (int i = 0; i < detailCount; i++) {
            if (details[i][0].equals(id)) count++;
        }
        return count;
    }
}
        }
    }

    public void displayCompounds() {
        System.out.println("\n--- Compounds ---");
        System.out.printf("%-15s %-20s%n", "Compound ID", "Name");
        System.out.println("-----------------------------------");
        for (int i = 0; i < compoundCount; i++) {
            System.out.printf("%-15s %-20s%n", compounds[i][0], compounds[i][1]);
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Compound Element Details ---");
        System.out.printf("%-15s %-15s %-15s%n", "Compound ID", "Element", "Atoms");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < detailCount; i++) {
            System.out.printf("%-15s %-15s %-15s%n", details[i][0], details[i][1], details[i][2]);
        }
    }


    // ----------------------------------------------------------------
    //  SEARCH METHODS
    // ----------------------------------------------------------------

    public void searchElementBySymbol(String symbol) {
        System.out.println("\nSearching element by symbol: " + symbol);
        for (int i = 0; i < elementCount; i++) {
            if (elements[i][0].equalsIgnoreCase(symbol)) {
                System.out.println("Found: " + elements[i][0] + " = " + elements[i][1]);
                return;
            }
        }
        System.out.println("Element '" + symbol + "' not found.");
    }

    public void searchCompoundById(String id) {
        System.out.println("\nSearching compound by ID: " + id);
        for (int i = 0; i < compoundCount; i++) {
            if (compounds[i][0].equals(id)) {
                System.out.println("Found: ID=" + compounds[i][0] + "  Name=" + compounds[i][1]);
                return;
            }
        }
        System.out.println("Compound ID '" + id + "' not found.");
    }

    public void searchDetailsByCompoundId(String id) {
        System.out.println("\nElements in Compound ID " + id + ":");
        boolean found = false;
        for (int i = 0; i < detailCount; i++) {
            if (details[i][0].equals(id)) {
                System.out.println("  Element: " + details[i][1] + "  Atoms: " + details[i][2]);
                found = true;
            }
        }
        if (!found) System.out.println("  No records found.");
    }

    public void searchDetailsByElement(String symbol) {
        System.out.println("\nCompounds containing element '" + symbol + "':");
        boolean found = false;
        for (int i = 0; i < detailCount; i++) {
            if (details[i][1].equalsIgnoreCase(symbol)) {
                System.out.println("  Compound ID: " + details[i][0] + "  Atoms: " + details[i][2]);
                found = true;
            }
        }
        if (!found) System.out.println("  Not found in any compound.");
    }


    // ----------------------------------------------------------------
    //  SORT METHODS (Bubble Sort)
    // ----------------------------------------------------------------

    public void sortElementsBySymbol() {
        for (int i = 0; i < elementCount - 1; i++) {
            for (int j = 0; j < elementCount - 1 - i; j++) {
                if (elements[j][0].compareToIgnoreCase(elements[j + 1][0]) > 0) {
                    String[] temp      = elements[j];
                    elements[j]        = elements[j + 1];
                    elements[j + 1]    = temp;
                }
            }
        }
        System.out.println("\nElements sorted by Symbol (A-Z):");
        displayElements();
    }

    public void sortElementsByName() {
        for (int i = 0; i < elementCount - 1; i++) {
            for (int j = 0; j < elementCount - 1 - i; j++) {
                if (elements[j][1].compareToIgnoreCase(elements[j + 1][1]) > 0) {
                    String[] temp      = elements[j];
                    elements[j]        = elements[j + 1];
                    elements[j + 1]    = temp;
                }
            }
        }
        System.out.println("\nElements sorted by Name (A-Z):");
        displayElements();
    }

    public void sortCompoundsById() {
        for (int i = 0; i < compoundCount - 1; i++) {
            for (int j = 0; j < compoundCount - 1 - i; j++) {
                if (Integer.parseInt(compounds[j][0]) > Integer.parseInt(compounds[j + 1][0])) {
                    String[] temp       = compounds[j];
                    compounds[j]        = compounds[j + 1];
                    compounds[j + 1]    = temp;
                }
            }
        }
        System.out.println("\nCompounds sorted by ID (ascending):");
        displayCompounds();
    }

    public void sortCompoundsByName() {
        for (int i = 0; i < compoundCount - 1; i++) {
            for (int j = 0; j < compoundCount - 1 - i; j++) {
                if (compounds[j][1].compareToIgnoreCase(compounds[j + 1][1]) > 0) {
                    String[] temp       = compounds[j];
                    compounds[j]        = compounds[j + 1];
                    compounds[j + 1]    = temp;
                }
            }
        }
        System.out.println("\nCompounds sorted by Name (A-Z):");
        displayCompounds();
    }

    public void sortDetailsByAtoms() {
        for (int i = 0; i < detailCount - 1; i++) {
            for (int j = 0; j < detailCount - 1 - i; j++) {
                if (Integer.parseInt(details[j][2]) < Integer.parseInt(details[j + 1][2])) {
                    String[] temp    = details[j];
                    details[j]       = details[j + 1];
                    details[j + 1]   = temp;
                }
            }
        }
        System.out.println("\nDetails sorted by Number of Atoms (descending):");
        displayDetails();
    }


    // ----------------------------------------------------------------
    //  UTILITY METHODS
    // ----------------------------------------------------------------

    public int totalAtomsInCompound(String id) {
        int total = 0;
        for (int i = 0; i < detailCount; i++) {
            if (details[i][0].equals(id)) {
                total += Integer.parseInt(details[i][2]);
            }
        }
        return total;
    }

    public int countElementsInCompound(String id) {
        int count = 0;
        for (int i = 0; i < detailCount; i++) {
            if (details[i][0].equals(id)) count++;
        }
        return count;
    }
}
