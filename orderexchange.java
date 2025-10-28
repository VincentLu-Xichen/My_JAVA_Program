public class orderexchange {
    public static int[] evenOddSwap(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int count = nums.length / 2; // Guaranteed same number of even and odd

        int[] oddIndices = new int[count];
        int[] evenIndices = new int[count];
        int odd_idx_p = 0;
        int even_idx_p = 0;

        // First pass: collect indices of odd and even numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenIndices[even_idx_p++] = i;
            } else {
                oddIndices[odd_idx_p++] = i;
            }
        }

        int[] result = new int[nums.length];
        
        // Second pass: build the result array by swapping values from original array
        // according to the collected indices.
        for (int i = 0; i < count; i++) {
            int oddIndex = oddIndices[i];
            int evenIndex = evenIndices[i];
            
            // Place the even number at the odd number's original spot
            result[oddIndex] = nums[evenIndex];
            // Place the odd number at the even number's original spot
            result[evenIndex] = nums[oddIndex];
        }

        return result;
    }

    public static void printInts(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 4};
        System.out.print("evenOddSwap([1, 2, 3, 4]) → ");
        printInts(evenOddSwap(nums1));

        // Test case 2
        int[] nums2 = {100, 25};
        System.out.print("evenOddSwap([100, 25]) → ");
        printInts(evenOddSwap(nums2));

        // Test case 3
        int[] nums3 = {};
        System.out.print("evenOddSwap([]) → ");
        printInts(evenOddSwap(nums3));

        // Test case 4
        int[] nums4 = {11, 55, 100, 200, 300, 7};
        System.out.print("evenOddSwap([11, 55, 100, 200, 300, 7]) → ");
        printInts(evenOddSwap(nums4));
    }
}
