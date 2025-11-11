public class TwoSwappable {
    public static boolean twoSwappable(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }else{
            char[] s1Chars = s1.toCharArray();
            char[] s2Chars = s2.toCharArray();
            char[] s1Even = new char[3];
            char[] s1Odd = new char[2];
            char[] s2Even = new char[3];
            char[] s2Odd = new char[2];
            //取出s1和s2的偶数位和奇数位
            for (int i = 0; i < s1.length(); i += 2){
                s1Even[i/2] = s1Chars[i];
                s2Even[i/2] = s2Chars[i];
            }
            for (int i = 1; i < s1.length(); i += 2){
                s1Odd[i/2] = s1Chars[i];
                s2Odd[i/2] = s2Chars[i];
            }
            // 校验偶数位、奇数位的多重性是否一致（排序后比较）
            char[] s1EvenSorted = s1Even.clone();
            char[] s2EvenSorted = s2Even.clone();
            char[] s1OddSorted = s1Odd.clone();
            char[] s2OddSorted = s2Odd.clone();

            java.util.Arrays.sort(s1EvenSorted);
            java.util.Arrays.sort(s2EvenSorted);
            java.util.Arrays.sort(s1OddSorted);
            java.util.Arrays.sort(s2OddSorted);

            if (!java.util.Arrays.equals(s1EvenSorted, s2EvenSorted)) {
                return false;
            }
            if (!java.util.Arrays.equals(s1OddSorted, s2OddSorted)) {
                return false;
            }
            
            
        }
        //如果以上判断都没有返回false，那么s1和s2是可交换的
        return true;
    }
    public static void main(String[] args) {
        System.out.println(twoSwappable("abcde", "cdabe"));
        System.out.println(twoSwappable("abcde", "edcba"));
        System.out.println(twoSwappable("abcde", "daceb"));
    }
}