public class Counter {
    private String name;
    private int value; // always >= 0

    /* No-arg constructor: name="untitled", value=0 */
    public Counter() {
        this("untitled", 0);
    }

    /* Full constructor. If initialValue < 0, store 0. If name is null, store "untitled". */
    public Counter(String name, int initialValue) {
        this.name = (name == null) ? "untitled" : name;
        this.value = Math.max(0, initialValue);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setName(String newName) {
        if (newName == null) {
            newName = "untitled";
        }
        this.name = newName;
    }

    /* Increase value by 1. */
    public void increment() {
        value++;
    }

    /* Reset value to 0. */
    public void reset() {
        value = 0;
    }

    /* String form: Counter(name="X", value=Y) */
    @Override
    public String toString() {
        return "Counter(name=\"" + name + "\", value=" + value + ")";
    }
}
