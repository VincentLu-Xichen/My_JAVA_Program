public class ClockTest {
    private static void printCase(String title, String expected, String actual) {
        System.out.printf("[%-18s] expected=%s | actual=%s%n", title, expected, actual);
    }

    public static void main(String[] args) {
        // 1) toString 基本格式
        Clock c1 = new Clock(7, 5);
        printCase("toString(7,5)", "07:05", c1.toString());

        Clock c2 = new Clock("07:05");
        printCase("toString('07:05')", "07:05", c2.toString());

        // 2) isEarlierThan 比较逻辑
        Clock a = new Clock(7, 5);
        Clock b = new Clock(8, 0);
        System.out.printf("[isEarlierThan a<b ] expected=true | actual=%s%n", a.isEarlierThan(b));

        Clock e1 = new Clock(8, 0);
        Clock e2 = new Clock(8, 0);
        System.out.printf("[isEarlierThan eq  ] expected=false | actual=%s%n", e1.isEarlierThan(e2));

        Clock c = new Clock(8, 1);
        System.out.printf("[isEarlierThan c<b ] expected=false | actual=%s%n", c.isEarlierThan(b));

        // 3) tick 跨分钟与小时
        Clock t1 = new Clock(23, 59);
        t1.tick();
        printCase("tick 23:59->", "00:00", t1.toString());
        t1.tick();
        printCase("tick ->", "00:01", t1.toString());

        // 4) tock 多分钟进位与小时归零
        Clock tk1 = new Clock(23, 58);
        tk1.tock(2); // 23:58 + 2 -> 24:00 -> 00:00
        printCase("tock +2", "00:00", tk1.toString());

        Clock tk2 = new Clock(23, 59);
        tk2.tock(1); // 23:59 + 1 -> 24:00 -> 00:00
        printCase("tock +1", "00:00", tk2.toString());

        // 5) 构造边界：超范围值（当前实现未规范化）
        Clock bad = new Clock(25, 70);
        printCase("ctor 25:70", "(应规范化为 01:10)", bad.toString());
    }
}