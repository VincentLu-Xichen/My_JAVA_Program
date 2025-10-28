public class Circle {
    private double centerX;
    private double centerY;
    private double radius;

    private static boolean isValidRadius(double r) {
        return Double.isFinite(r) && r > 0.0;
    }

    public Circle() {
        centerX = 0.0;
        centerY = 0.0;
        radius = 1.0;
    }

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = isValidRadius(radius) ? radius : 1.0;
    }

    public void setCenter(double newX, double newY) {
        this.centerX = newX;
        this.centerY = newY;
    }

    public void setRadius(double newRadius) {
        if (isValidRadius(newRadius)) {
            this.radius = newRadius;
        }
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle(center=(" + centerX + ", " + centerY + "), radius=" + radius + ")";
    }
}
