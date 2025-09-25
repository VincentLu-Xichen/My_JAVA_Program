import java.util.Scanner;

public class Harmonic_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int count = 1;
        double h = 0.0;
        while (count <= k){
            h += 1.0 / count;
            count++;
        }
        System.out.println(h);
        scanner.close();
    }
}
