import java.util.Scanner;
public class hailstone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 1; // 初始化循环计数器
        
        while (n!=1){
            if (n%2==0){
                n = n/2;
            }
            else {
                n = 3*n+1;
            }
            count++; 
        }
        
        System.out.println(count);
        scanner.close();
    }
}
