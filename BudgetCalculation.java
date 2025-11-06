public class BudgetCalculation {
    public static int calcNetIncome(String input){
        String[] split = input.split("[,;\\s]+");
        int netIncome = 0;
        String[] positiveNumbers = new String[split.length];
        String[] negativeNumbers = new String[split.length];
        int posNumcount = 0;  // 移到外部，避免重复重置
        int negNumcount = 0;  // 移到外部，避免重复重置
        
        for (int i = 0; i < split.length; i++) {// 遍历每个字符
           if (!split[i].contains("-")) {// 如果不包含负号
                String currentNumber = "";  // 用于拼接当前数字
                for (int j = 0; j < split[i].length(); j++) {// 遍历每个字符
                    if (Character.isDigit(split[i].charAt(j))) {// 如果是数字
                        currentNumber += split[i].charAt(j);  // 拼接数字字符
                    } else {
                        // 遇到非数字字符，如果已经有数字则保存
                        if (!currentNumber.isEmpty()) {
                            positiveNumbers[posNumcount] = currentNumber;
                            posNumcount++;
                            currentNumber = "";  // 重置当前数字
                        }
                    }
                }
                // 处理字符串末尾的数字
                if (!currentNumber.isEmpty()) {
                    positiveNumbers[posNumcount] = currentNumber;
                    posNumcount++;
                }
            } else {// 如果包含负号
                String currentNumber = "";  // 用于拼接当前数字
                for (int j = 0; j < split[i].length(); j++) {// 遍历每个字符
                    if (Character.isDigit(split[i].charAt(j))) {// 如果是数字
                        currentNumber += split[i].charAt(j);  // 拼接数字字符
                    } else {
                        // 遇到非数字字符，如果已经有数字则保存
                        if (!currentNumber.isEmpty()) {
                            negativeNumbers[negNumcount] = currentNumber;
                            negNumcount++;
                            currentNumber = "";  // 重置当前数字
                        }
                    }
                }
                // 处理字符串末尾的数字
                if (!currentNumber.isEmpty()) {
                    negativeNumbers[negNumcount] = currentNumber;
                    negNumcount++;
                }
            }
        }
        
        // 计算正数总和
        for (int i = 0; i < positiveNumbers.length; i++) {
            if (positiveNumbers[i] != null) {
                netIncome += Integer.parseInt(positiveNumbers[i]);
            }
        }
        
        // 减去负数总和
        for (int i = 0; i < negativeNumbers.length; i++) {
            if (negativeNumbers[i] != null) {
                netIncome -= Integer.parseInt(negativeNumbers[i]);
            }
        }
        
        return netIncome;
    }
    
    public static void main(String[] args) {
        // 测试用例
        System.out.println("Test 1: " + calcNetIncome("salary 15000yuan bonus2000 rent -1000Y")); // 期望: 16000
        System.out.println("Test 2: " + calcNetIncome("25000 gross income, -200 water, electricity:-300")); // 期望: 24500
    }
}
