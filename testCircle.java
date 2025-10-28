public class testCircle {
    public static void main(String[] args) {
        //Example 1
        Circle c1 = new Circle();
        System.out.println(c1); // -> Circle(center=(0.0, 0.0), radius=1.0)
        System.out.println(c1.getArea()); // -> 3.141592653589793
        System.out.println(c1.getCircumference()); // -> 6.283185307179586

        // Example 2: parameterized constructor + setters
        Circle c2 = new Circle(2.0, -1.5, 3.0);
        System.out.println(c2); // -> Circle(center=(2.0, -1.5), radius=3.0)
        c2.setRadius(5.0);
        System.out.println(c2.getRadius()); // -> 5.0
        System.out.println(c2.getArea()); // -> 78.53981633974483

        // Example 3: invalid radius handling
        Circle c3 = new Circle(0.0, 0.0, -10.0);
        System.out.println(c3.getRadius()); // Expected: 1.0
        c3.setRadius(-2.0); // Should ignore invalid input (radius stays same)
        System.out.println(c3.getRadius()); // Expected: 1.0
    }

}
