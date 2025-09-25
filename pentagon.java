import java.util.Scanner;
public class pentagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double r = Double.parseDouble(input);
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = 5 * s * s / (4 * Math.tan(Math.PI / 5));
        System.out.println("Area = " + area);
        scanner.close();
    }


    
}
