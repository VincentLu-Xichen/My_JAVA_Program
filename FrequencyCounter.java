public class FrequencyCounter {
    public static void main(String[] args) {
        int num = 1;
        int[] input = {1,2,1,5,6,2,10,4578,3,1,3,6,5,1,4};
        int result = frequency(input, num);
        System.out.println("数字 " + num + " 在数组中出现的次数是: " + result);
    }
    public static int frequency(int[] input, int num){
        int count = 0;
        for (int i = 0; i < input.length; i ++){
            if (num == input[i]){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
