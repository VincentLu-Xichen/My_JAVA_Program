public class removeLeftmost {
    public static void main(String[] args) {
        String input = "wcnmb";
        String substring = "cnm";
        String result = removeLeftmost.removeLeftmostSubstring(input, substring);
        System.out.println(result); 
    }

    public static String removeLeftmostSubstring(String input, String substring) {
        while (input.indexOf(substring) != -1) { 
            int index = input.indexOf(substring); 
            input = input.substring(0, index) + input.substring(index + substring.length());
        }    
        return input; 
    
    }
}