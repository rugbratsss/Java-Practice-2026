public class ChemicalDatabase {

    private String[][] elements = {
        {"H",  "Hydrogen"},
        {"C",  "Carbon"  },
        {"N",  "Nitrogen"},
        {"O",  "Oxygen"  },
        {"Na", "Sodium"  },
        {"Cl", "Chlorine"},
        {"He", "Helium"  }
    };

    private String[][] compounds = {
        {"100", "Water"           },
        {"101", "Carbon Dioxide"  },
        {"102", "Ammonia"         },
        {"103", "Table Salt"      },
        {"104", "Mystery Compound"}
    };

    private String[][] details = {
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

    public String[][] getElements()  { return elements;  }
    public String[][] getCompounds() { return compounds; }
    public String[][] getDetails()   { return details;   }

    public String[][] searchAll(String query) {
        String q = query.trim().toLowerCase();
        String[][] results = new String[50][5];
        int count = 0;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i][0].toLowerCase().contains(q) || elements[i][1].toLowerCase().contains(q)) {
                String elementSymbol = elements[i][0];
                String elementName   = elements[i][1];

                String compoundId   = "-";
                String compoundName = "-";
                String atoms        = "-";

                for (int j = 0; j < details.length; j++) {
                    if (details[j][1].equalsIgnoreCase(elementSymbol)) {
                        String cid = details[j][0];
                        String at  = details[j][2];

                        for (int k = 0; k < compounds.length; k++) {
                            if (compounds[k][0].equals(cid)) {
                                results[count][0] = elementSymbol;
                                results[count][1] = elementName;
                                results[count][2] = cid;
                                results[count][3] = compounds[k][1];
                                results[count][4] = at;
                                count++;
                                break;
                            }
                        }
                    }
                }

                if (count == 0 || !results[count - 1][0].equalsIgnoreCase(elementSymbol)) {
                    results[count][0] = elementSymbol;
                    results[count][1] = elementName;
                    results[count][2] = "-";
                    results[count][3] = "-";
                    results[count][4] = "-";
                    count++;
                }
            }
        }

        for (int i = 0; i < compounds.length; i++) {
            if (compounds[i][0].contains(q) || compounds[i][1].toLowerCase().contains(q)) {
                String cid  = compounds[i][0];
                String name = compounds[i][1];
                boolean hasElements = false;

                for (int j = 0; j < details.length; j++) {
                    if (details[j][0].equals(cid)) {
                        String sym      = details[j][1];
                        String at       = details[j][2];
                        String eName    = "-";

                        for (int k = 0; k < elements.length; k++) {
                            if (elements[k][0].equalsIgnoreCase(sym)) {
                                eName = elements[k][1];
                                break;
                            }
                        }

                        results[count][0] = sym;
                        results[count][1] = eName;
                        results[count][2] = cid;
                        results[count][3] = name;
                        results[count][4] = at;
                        count++;
                        hasElements = true;
                    }
                }

                if (!hasElements) {
                    results[count][0] = "-";
                    results[count][1] = "-";
                    results[count][2] = cid;
                    results[count][3] = name;
                    results[count][4] = "-";
                    count++;
                }
            }
        }

        String[][] trimmed = new String[count][5];
        for (int i = 0; i < count; i++) {
            trimmed[i] = results[i];
        }
        return trimmed;
    }
}
