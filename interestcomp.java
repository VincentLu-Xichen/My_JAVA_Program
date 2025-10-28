
public class interestcomp {
    public static double compintre(double principle, double rate, double year) {
        double total = principle;
        if (rate < 1) {
            for (int i = 0; i < year; i++) {
                total = total * (1 + rate);
            }
            return total;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        double principle = 200000;
        double rate = 0.1;
        double year = 9;
        double total = compintre(principle, rate, year);
        System.out.println(total);
    }
}
