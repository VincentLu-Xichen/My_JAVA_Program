import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        
        // 循环k次，找出k个阿姆斯特朗数
        while (k != 0) {
            // 判断a的位数
            int temp = a;
            int count = 0;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            
            // 计算每一位数字的count次幂之和
            temp = a;
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp = temp / 10;
            }
            
            // 判断a是否为阿姆斯特朗数
            if (sum == a) {
                System.out.println(a);
                k--;
            }
            
            a++;
        }
        
        scanner.close();
    }
}

