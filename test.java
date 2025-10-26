public class test {
    public static int te(int a, int b, int c) {
        int max = Math.max(a,b);
        if (c > max){
            max = c;
        }
        return max;
    
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(te(a,b,c));
    }
}
