import java.util.Scanner;
public class dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = Integer.parseInt(scanner.nextLine());
        int[] dice = new int [b];
        
        for (int i = 0; i < dice.length ; i++){
            int m = 0;
            m = (int) (Math.random() * 6) + 1;
            dice[i] = m;
            System.out.println(dice[i]);
        }
        scanner.close();
    }
}
