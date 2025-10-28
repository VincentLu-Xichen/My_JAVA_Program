public class Temperature {
    private double celsius;

    public Temperature() {
        celsius = 0.0;
        
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
        
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public void increase(double deltaC) {
        
        this.celsius += deltaC;
    }

    public boolean isBelowFreezing() {
        
        return celsius < 0.0;
    }

    public String toString() {
        
        return (int)celsius + "C (" + (int)getFahrenheit() + "F)";
    }

    public static void main(String[] args) {
        Temperature t0 = new Temperature();
        System.out.println(t0.getCelsius());
        System.out.println(t0.getFahrenheit());
        System.out.println(t0);

        Temperature t1 = new Temperature(-1.5);
        System.out.println(t1.isBelowFreezing());
        t1.increase(3.0);
        System.out.println(t1.isBelowFreezing());
        System.out.println(t1.getFahrenheit());
    }
}