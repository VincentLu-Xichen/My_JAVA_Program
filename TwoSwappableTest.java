public class TwoSwappableTest {
    private static void run(String s1, String s2, boolean expected) {
        boolean got = two.twoSwappable(s1, s2);
        String status = (got == expected) ? "PASS" : "FAIL";
        System.out.println(status + " | s1=\"" + s1 + "\" s2=\"" + s2 + "\" => expected=" + expected + ", got=" + got);
    }

    public static void main(String[] args) {
        // 题目给出的样例
        run("abcde", "cdabe", true);   // parity 保持，应该为 true
        run("abcde", "edcba", true);   // parity 保持，应该为 true
        run("abcde", "daceb", false);  // parity 不匹配，应该为 false

        // 已相等
        run("abcde", "abcde", true);

        // 单次跨奇偶交换（当前实现会判定为 false）
        run("abcde", "acbde", false);

        // 重复字符，偶数位计数不一致（当前实现可能错误判定为 true）
        // s1Even = [a,a,b], s2Even = [a,b,b]，多重性不同 -> 应该为 false
        run("aaabb", "aabbb", false);

        // 重复字符，奇数位计数不一致（当前实现可能错误判定为 true）
        // s1Odd = [a,a], s2Odd = [a,b]，多重性不同 -> 应该为 false
        run("bacae", "bacbe", false);

        // 重复字符但多重性匹配（应该为 true）
        // s1Even = [a,c,a], s1Odd = [b,a]; s2Even = [a,c,a], s2Odd = [a,b]
        run("abcaa", "aacba", true);

        // 全相同字符
        run("zzzzz", "zzzzz", true);

        // 非字母字符
        run("12345", "32154", false);

        // 长度不同（应该为 false）
        run("abcde", "abcdef", false);
    }
}