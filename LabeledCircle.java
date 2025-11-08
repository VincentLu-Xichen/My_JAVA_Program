// CW1 #8.1

public class LabeledCircle extends Circle {
    private String label;
    private boolean filled;

    public LabeledCircle() {
        super();
        this.label = "untitled";
        this.filled = false;
    }

    public LabeledCircle(double centerX, double centerY, double radius, String label, boolean filled) {
        super(centerX, centerY, radius);
        if (label == null) {
            this.label = "untitled";
        } else {
            this.label = label;
        }
        this.filled = filled;



    }

    public String getLabel() {
        return this.label;
		
		
		
    }

    public void setLabel(String newLabel) {
        if (newLabel == null) {
            this.label = "untitled";
        } else {
            this.label = newLabel;
        }
    }

    public boolean isFilled() {
        return this.filled;
		
		
		
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
		
		
		
    }

    public double getDiameter() {
        return this.getRadius() * 2;
		
		
		
    }

    public void moveBy(double dx, double dy) {
        this.setCenter(this.getCenterX() + dx, this.getCenterY() + dy);
        
		
		
		
    }

    @Override
    public String toString() {
        String str = new String();
        str = "LabeledCircle(center=(" + this.getCenterX() + ", " + this.getCenterY() + ")"
            + ", radius=" + this.getRadius()
            + ", label=\"" + this.getLabel()
            + "\", filled=" + this.isFilled() + ")";
        return str;


    }
    public static void main(String[] args) {
    
    // Example 1: default constructor + overridden toString
    LabeledCircle a = new LabeledCircle();
    System.out.println(a); // -> LabeledCircle(center=(0.0, 0.0), radius=1.0,
    // label="untitled", filled=false)
    System.out.println(a.getDiameter()); // -> 2.0

    // Example 2: full constructor + movement
    LabeledCircle b = new LabeledCircle(2.0, -1.5, 3.0, "Room A", true);
    System.out.println(b.getRadius()); // -> 3.0
    System.out.println(b.isFilled()); // -> true
    b.moveBy(-2.0, 1.5); // center becomes (0.0, 0.0)
    System.out.println(b); // -> LabeledCircle(center=(0.0, 0.0), radius=3.0,
    // label="Room A", filled=true)
    
    // Example 3: polymorphism with overridden method
    Circle ref = new LabeledCircle(1.0, 1.0, 2.0, "C2", false);
    System.out.println(ref.getArea()); // uses Circle.getArea()
    System.out.println(ref); // calls LabeledCircle.toString() at runtime
    
    // Example 4: change label and filled
    LabeledCircle c = new LabeledCircle(0.0, 0.0, 2.5, "X", false);
    System.out.println(c);
    c.setLabel("Updated");
    c.setFilled(true);
    System.out.println(c);

    // Example 5: moveBy with decimals to bring center to origin
    LabeledCircle d = new LabeledCircle(-3.2, 4.1, 1.0, "D", false);
    d.moveBy(3.2, -4.1);
    System.out.println(d);

    // Example 6: zero radius
    LabeledCircle e = new LabeledCircle(1.0, 2.0, 0.0, "Zero", false);
    System.out.println(e.getDiameter());
    System.out.println(e);

    // Example 7: polymorphic array
    Circle[] circles = {
        new LabeledCircle(0.0, 0.0, 1.0, "A", true),
        new LabeledCircle(2.0, 2.0, 2.0, "B", false),
        new LabeledCircle(-1.0, 3.0, 1.5, "C", true)
    };
    for (Circle cc : circles) {
        System.out.println(cc); // runtime dispatch to LabeledCircle.toString()
    }
    }
}
