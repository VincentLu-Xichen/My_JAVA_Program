import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (a > 21 && b > 21){
            System.out.println(-1);
        }
        else if (a > 21 || b > 21){
            System.out.println(Math.min(a,b));
        }
        else {
            System.out.println(Math.max(a,b));
        }
        scanner.close();
    }
}
