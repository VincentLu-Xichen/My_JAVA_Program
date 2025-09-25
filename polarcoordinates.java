import java.util.Scanner;

public class polarcoordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double x = Double.parseDouble(input);
        input = scanner.nextLine();
        double y = Double.parseDouble(input);

        double r = Math.sqrt(x*x+y*y);
        double theta = Math.atan2(y, x);
        
        System.out.println("r = " + r);
        System.out.println("theta = " + theta);
        
        scanner.close();
    }
    
}
