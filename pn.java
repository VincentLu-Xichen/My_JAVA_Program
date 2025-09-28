import java.util.Scanner;

public class pn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int sum = 0;
        int m = 1;
        while (m < n){
            if (n%m == 0){
                sum += m;
            }
            m++;
        }
        if (sum == n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
}
