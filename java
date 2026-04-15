import java.util.regex.Pattern;

public class IdValidator {

    /**
     * Validates a 13-digit ID number using Regex and Luhn Algorithm.
     * @param id The ID string to check
     * @return true if valid, false otherwise
     */
    public static boolean isValidId(String id) {
        // 1. Basic Check: Must be exactly 13 digits
        if (id == null || !Pattern.matches("^\\d{13}$", id)) {
            return false;
        }

        // 2. Logical Check: Extract and validate Date of Birth (YYMMDD)
        int month = Integer.parseInt(id.substring(2, 4));
        int day = Integer.parseInt(id.substring(4, 6));

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }

        // 3. Mathematical Check: Luhn Algorithm (Checksum)
        return validateLuhn(id);
    }

    private static boolean validateLuhn(String id) {
        int sum = 0;
        boolean alternate = false;

        for (int i = id.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(id.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    public static void main(String[] args) {
        String testId = "9201015009087"; // Example format
        if (isValidId(testId)) {
            System.out.println("ID " + testId + " is valid.");
        } else {
            System.out.println("ID " + testId + " is invalid.");
        }
    }
}
