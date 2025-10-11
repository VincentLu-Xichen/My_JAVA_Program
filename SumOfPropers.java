public class SumOfPropers {
    public static int calculateSumOfProper(int[] nums){
        int sum = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] % (i + 1) == 0){
                sum += nums[i];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // 示例测试
        int[] testArray = {10 , 25};
        int result = calculateSumOfProper(testArray);
        System.out.println("Sum of proper divisors: " + result);
    }
}
