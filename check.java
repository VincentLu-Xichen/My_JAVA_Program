public class check {

    public static boolean isValidID(String text) {
        // Step 1: Validate input length
        if (text == null || text.length() < 5) {
            return false;
        }

        // Step 2: Calculate the sum of digits
        int sum = 0;
        for (int i = 0; i < text.length() - 1; i++) { // Exclude the last character
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }

        // Step 3: Compute modulo 11
        int modulo = sum % 11;

        // Step 4: Validate the last character
        char lastChar = text.charAt(text.length() - 1);
        if (modulo == 10) {
            return lastChar == 'X' || lastChar == 'x';
        } else {
            return Character.isDigit(lastChar) && (lastChar - '0') == modulo;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidID("THMBB7092WD114221")); // false
        System.out.println(isValidID("A001-606X-17X"));     // true
    }
}
