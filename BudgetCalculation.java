public class BudgetCalculation {
    public static int calcNetIncome(String input){
        String[] tokens = input.split("[ ,;]"); // 修复分割语句
        int addup = 0; // 初始化累加变量
        int minus = 0; // 初始化减法变量

        for (String token : tokens) { // 遍历每个分块
            if (token.startsWith("-")) { // 判断是否为负数
                String sum = ""; // 初始化数字字符串
                for (int j = 0; j < token.length(); j++) { // 遍历子字符串中的每个字符
                    String sub = token.substring(j, j + 1); // 使用 substring 提取单个字符
                    if (Character.isDigit(sub.charAt(0))) { // 判断是否为数字
                        sum += sub; // 拼接数字字符
                    }
                }
                if (!sum.isEmpty()) { // 如果存在数字，转换为整数
                    minus += Integer.parseInt(sum); // 修复：累加负数部分
                }
            } else { // 正数处理
                String sum = ""; // 初始化数字字符串
                for (int j = 0; j < token.length(); j++) { // 遍历子字符串中的每个字符
                    String sub = token.substring(j, j + 1); // 使用 substring 提取单个字符
                    if (Character.isDigit(sub.charAt(0))) { // 判断是否为数字
                        sum += sub; // 拼接数字字符
                    }
                }
                if (!sum.isEmpty()) { // 如果存在数字，转换为整数
                    addup += Integer.parseInt(sum); // 修复：累加正数部分
                }
            }
        }
        return addup - minus; // 返回净收入
    }
    public static void main(String[] args) {
        // 测试用例 1: 简单正数和负数
        System.out.println("Test 1: " + calcNetIncome("1000,-500,200") + " (Expected: 700)");

        // 测试用例 2: 包含空格和分隔符
        System.out.println("Test 2: " + calcNetIncome("  3000 ; -1000 , 2000 ") + " (Expected: 4000)");

        // 测试用例 3: 无负数
        System.out.println("Test 3: " + calcNetIncome("500,300,200") + " (Expected: 1000)");

        // 测试用例 4: 无正数
        System.out.println("Test 4: " + calcNetIncome("-100,-200,-300") + " (Expected: -600)");

        // 测试用例 5: 混合字符
        System.out.println("Test 5: " + calcNetIncome("salary 15000yuan bonus2000 rent -1000Y") + " (Expected: 16000)");

        // 测试用例 6: 只有非数字字符
        System.out.println("Test 6: " + calcNetIncome("abc,xyz,-def") + " (Expected: 0)");

        // 测试用例 7: 负号不在数字前
        System.out.println("Test 7: " + calcNetIncome("1000-,2000") + " (Expected: 3000)");

        // 测试用例 8: 连续多个分隔符
        System.out.println("Test 8: " + calcNetIncome("1000,,,-500;;;200") + " (Expected: 700)");

        // 测试用例 9: 大数字
        System.out.println("Test 9: " + calcNetIncome("1000000,-500000,200000") + " (Expected: 700000)");

        // 测试用例 10: 包含特殊字符
        System.out.println("Test 10: " + calcNetIncome("1000$,-500@,200#") + " (Expected: 700)");
    }
}
