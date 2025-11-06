public class CircleTestSuite {
    private static int total = 0;
    private static int passed = 0;
    private static int failed = 0;
    private static final double EPS = 1e-9;

    private static void assertDoubleEquals(double expected, double actual, double eps, String name) {
        total++;
        boolean ok;
        if (Double.isNaN(expected) || Double.isNaN(actual)) {
            ok = Double.isNaN(expected) && Double.isNaN(actual);
        } else if (Double.isInfinite(expected) || Double.isInfinite(actual)) {
            ok = Double.isInfinite(expected) && Double.isInfinite(actual) && Double.compare(expected, actual) == 0;
        } else {
            ok = Math.abs(expected - actual) <= eps;
        }
        if (ok) {
            passed++;
            System.out.println("PASS: " + name);
        } else {
            failed++;
            System.out.println("FAIL: " + name + " | expected=" + expected + ", actual=" + actual);
        }
    }

    private static void assertStringEquals(String expected, String actual, String name) {
        total++;
        if (expected.equals(actual)) {
            passed++;
            System.out.println("PASS: " + name);
        } else {
            failed++;
            System.out.println("FAIL: " + name + " | expected='" + expected + "', actual='" + actual + "'");
        }
    }

    /*private static void assertTrue(boolean condition, String name) {
        total++;
        if (condition) {
            passed++;
            System.out.println("PASS: " + name);
        } else {
            failed++;
            System.out.println("FAIL: " + name);
        }
    }*/

    public static void main(String[] args) {
        // Default constructor
        Circle c1 = new Circle();
        assertDoubleEquals(0.0, c1.getCenterX(), EPS, "Default centerX");
        assertDoubleEquals(0.0, c1.getCenterY(), EPS, "Default centerY");
        assertDoubleEquals(1.0, c1.getRadius(), EPS, "Default radius");
        assertDoubleEquals(Math.PI, c1.getArea(), EPS, "Default area");
        assertDoubleEquals(2 * Math.PI * 1.0, c1.getCircumference(), EPS, "Default circumference");
        assertStringEquals("Circle(center=(0.0, 0.0), radius=1.0)", c1.toString(), "Default toString");

        // Parameterized constructor (positive radius)
        Circle c2 = new Circle(2.0, -1.5, 3.0);
        assertDoubleEquals(2.0, c2.getCenterX(), EPS, "c2 centerX");
        assertDoubleEquals(-1.5, c2.getCenterY(), EPS, "c2 centerY");
        assertDoubleEquals(3.0, c2.getRadius(), EPS, "c2 radius");
        assertDoubleEquals(Math.PI * 9.0, c2.getArea(), EPS, "c2 area");
        assertDoubleEquals(2 * Math.PI * 3.0, c2.getCircumference(), EPS, "c2 circumference");
        assertStringEquals("Circle(center=(2.0, -1.5), radius=3.0)", c2.toString(), "c2 toString");

        // setRadius: positive
        c2.setRadius(5.0);
        assertDoubleEquals(5.0, c2.getRadius(), EPS, "c2 setRadius 5.0");
        assertDoubleEquals(2 * Math.PI * 5.0, c2.getCircumference(), EPS, "c2 circumference r=5");

        // setRadius: negative should be ignored (stays 5.0)
        c2.setRadius(-10.0);
        assertDoubleEquals(5.0, c2.getRadius(), EPS, "c2 setRadius negative ignored");

        // setRadius: zero should be rejected (radius stays 5.0 under new invariant)
        c2.setRadius(0.0);
        assertDoubleEquals(5.0, c2.getRadius(), EPS, "c2 setRadius zero rejected");
        assertDoubleEquals(2 * Math.PI * 5.0, c2.getCircumference(), EPS, "c2 circumference still r=5 after zero rejected");

        // Constructor: invalid radius (negative) becomes 1.0
        Circle c3 = new Circle(0.0, 0.0, -10.0);
        assertDoubleEquals(1.0, c3.getRadius(), EPS, "c3 radius from negative -> 1.0");
        c3.setRadius(-2.0);
        assertDoubleEquals(1.0, c3.getRadius(), EPS, "c3 setRadius negative ignored");

        // setCenter updates both coordinates
        c3.setCenter(10.0, 20.0);
        assertDoubleEquals(10.0, c3.getCenterX(), EPS, "c3 setCenter X");
        assertDoubleEquals(20.0, c3.getCenterY(), EPS, "c3 setCenter Y");
        assertStringEquals("Circle(center=(10.0, 20.0), radius=1.0)", c3.toString(), "c3 toString after setCenter");

        // Constructor with NaN radius should fallback to 1.0 under new invariant
        Circle c4 = new Circle(0.0, 0.0, Double.NaN);
        assertDoubleEquals(1.0, c4.getRadius(), EPS, "c4 radius from NaN -> 1.0");
        assertDoubleEquals(Math.PI * 1.0, c4.getArea(), EPS, "c4 area after NaN fallback");
        assertDoubleEquals(2 * Math.PI * 1.0, c4.getCircumference(), EPS, "c4 circumference after NaN fallback");

        // Constructor with Infinity radius should fallback to 1.0
        Circle c5 = new Circle(0.0, 0.0, Double.POSITIVE_INFINITY);
        assertDoubleEquals(1.0, c5.getRadius(), EPS, "c5 radius from +Inf -> 1.0");
        assertDoubleEquals(Math.PI * 1.0, c5.getArea(), EPS, "c5 area after +Inf fallback");
        assertDoubleEquals(2 * Math.PI * 1.0, c5.getCircumference(), EPS, "c5 circumference after +Inf fallback");

        // Summary
        System.out.println("\nSummary: total=" + total + ", passed=" + passed + ", failed=" + failed);
        if (failed > 0) {
            System.exit(1);
        }
    }
}