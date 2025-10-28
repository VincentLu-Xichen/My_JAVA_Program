public class diamondshape {
    public static void diamond(int n){
        int half = n / 2;
        for (int i = 0; i <= half; i++){
            String star = "";
            for (int j = 0; j < half - i; j++) star += ". ";    // 左侧空格
            for (int j = 0; j < 2 * i + 1; j++) star += "* ";   // 星号 1,3,5,...
            for (int j = 0; j < half - i; j++) star += ". ";    // 右侧空格
            System.out.println(star);
        }
        for (int i = half - 1; i >= 0; i--){
            String star = "";
            for (int j = 0; j < half - i; j++) star += ". ";    // 左侧空格
            for (int j = 0; j < 2 * i + 1; j++) star += "* ";
            for (int j = 0; j < half - i; j++) star += ". ";    // 右侧空格
            System.out.println(star);
        }
    }
    public static void main(String[] args){
        diamond(5);
    }
}
