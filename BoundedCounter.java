public class BoundedCounter extends Counter {
    private int max;
	
	
	// Lab 8 Challenge

    /* No-argument constructor: name="untitled", value=0, max=10 */
    public BoundedCounter() {
		super();
        max = 10;
		
		
    }

    /* Full constructor */
    public BoundedCounter(String name, int initialValue, int max) {
        // super(...) 必须是构造函数的第一条语句；将初始值夹到不超过 max
        super(name, Math.min(initialValue, max));
        this.max = max;
		
    }

    public int getMax() {
		return max;
		
    }

    public boolean isAtMax() {
        if (this.getValue() == this.max){
            return true;
        }else if (this.getValue() > this.max){
            return true;
        }return false;
		
		
	}

    /* Overridden: increment only if not at max */
    @Override
    public void increment() {
        if (this.isAtMax() == false){
            super.increment();
        }
		
		
    }

    /* Overridden: provide richer textual output */
    @Override
    public String toString() {
        String str = new String();
        str = "BoundedCounter(name=\"" + this.getName()
            + "\", value=" + this.getValue()
            + ", max=" + this.getMax() + ")";
		return str;
		
    }
    public static void main(String[] args) {
        BoundedCounter a = new BoundedCounter();
        System.out.println(a);
        a.increment();
        System.out.println(a.getValue());
        System.out.println(a.isAtMax());
        
        BoundedCounter b = new BoundedCounter("Study reps", 12, 10);
        System.out.println(b);
        b.increment();
        System.out.println(b.getValue());
        System.out.println(b.isAtMax());
    }

}
