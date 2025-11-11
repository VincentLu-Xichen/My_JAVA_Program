public class NumberReverse {
    public static String revNum(String input) {
        // 先将字符串转换为字符数组，方便操作
        char[] chars = new char[input.length()];
        int n = input.length();
        for (int i = 0; i < n; i++) {
            chars[i] = input.charAt(i);
        }
        
        // 从字符数组中提取所有数字，构造新数组
        char[] nums = new char[n];
        int digitCount = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(chars[i])) {
                nums[digitCount] = chars[i];
                digitCount++;
            }
        }
        
        //记录所有数字在字符串中的相对位置
        int[] digitPos = new int[digitCount];
        for (int i = 0; i < digitCount; i ++){
            digitPos[i] = input.indexOf(nums[i]);
        }

        //构造新数组调换位置
        char[] newNum = new char[digitCount];
        for (int i = 0; i < digitCount; i ++){
            newNum[i] = nums[digitCount - 1 - i];
        }

        //将新数组中的数字进行调换
        for (int i = 0; i < digitCount; i ++){
            chars[digitPos[i]] = newNum[i];
        }

        //将字符数组转换为字符串返回
        return new String(chars);
    }
    public static void main(String[] args) {
        System.out.println(revNum("x123_#_4567 yz"));
    }
}
