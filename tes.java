public class tes {
    public static int calcNetIncome(String input){
        int netIncome = 0;
        int i = 0;
        
        while (i < input.length()) {
            // Skip non-digit and non-minus characters
            while (i < input.length() && !Character.isDigit(input.charAt(i)) && input.charAt(i) != '-') {
                i++;
            }
            
            if (i >= input.length()) {
                break;
            }
            
            // Count consecutive minus signs to determine if number should be negative
            int minusCount = 0;
            while (i < input.length() && input.charAt(i) == '-') {
                minusCount++;
                i++;
            }
            
            // Skip any spaces after minus signs
            while (i < input.length() && input.charAt(i) == ' ') {
                i++;
            }
            
            // Extract the number
            String numberStr = "";
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                numberStr += input.charAt(i);
                i++;
            }
            
            // If we found a valid number, add it to the total
            if (!numberStr.isEmpty()) {
                int value = Integer.parseInt(numberStr);
                // If odd number of minus signs, make it negative
                if (minusCount % 2 == 1) {
                    value = -value;
                }
                netIncome += value;
            }
        }
        
        return netIncome;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(calcNetIncome("salary 15000yuan bonus2000 rent -1000Y")); // Expected: 16000
        System.out.println(calcNetIncome("25000 gross income, -200 water, electricity:-300")); // Expected: 24500
    }
}
