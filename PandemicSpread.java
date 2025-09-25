import java.util.Scanner;

public class PandemicSpread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int init = Integer.parseInt(scanner.nextLine());
        int numInfect = Integer.parseInt(scanner.nextLine());
        int population = Integer.parseInt(scanner.nextLine());
        
        int day = 1;
        int infect = init;
        
        while (infect < population){
            infect = infect +infect * numInfect;
            day++;
        }
        System.out.println(day);
        scanner.close();
    }
}
        
    

