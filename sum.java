
public class sum {
    public static void main(String[] args){
        
        int[] arr = {1,2,3,4,5};
        int a = maxConsecutiveSum(arr);
        System.out.println(a);
    }
    
    public static int maxConsecutiveSum(int[] arr){
        if (arr.length == 0) return 0;
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++){
            int currentSum = 0;
            for(int j = i; j < arr.length; j++){
                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}
    

