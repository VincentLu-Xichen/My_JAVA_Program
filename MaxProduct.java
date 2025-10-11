public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {-1, 2};
        int result = findMaxProduct(nums);
        System.out.println("最大乘积: " + result);
    }
    
    public static int findMaxProduct(int[] nums){
        if (nums == null || nums.length < 2){
            return 0;
        }
        int maxProduct = nums[0] * nums[1];
        for (int i = 0; i < nums.length; i++) {
            int currentProduct = 1;
            for (int j = i + 1; j < nums.length; j++) { 
                currentProduct = nums[i] * nums[j];
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                }
            }
        }
        return maxProduct;
    }
}

