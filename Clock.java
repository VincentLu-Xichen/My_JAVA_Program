/*
 * Exercise of Week #6, to be used again in Week #8
 * Complete using your codes in Week #6 or the standard solutions
 *
 */

public class Clock {
    private int hours;
    private int minutes;

    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
		this.hours = h;
        this.minutes = m;
		
		
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
		this.hours = Integer.parseInt(s.substring(0, 2));
        this.minutes = Integer.parseInt(s.substring(3, 5));
		
		
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String h = Integer.toString(this.hours);
        String m = Integer.toString(this.minutes);
        if (h.length() < 2) {
            h = "0" + h;
        }
        if (m.length() < 2) {
            m = "0" + m;
        }
        String time = h + ':' + m;
        return time;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
		if (this.hours < that.hours) {
            return true;
        }else if(this.hours == that.hours) {
            if(this.minutes < that.minutes){
                return true;
            }
        }
        return false;
    }

    // Adds 1 minute to the time on this clock.
    public void tick() {
		this.minutes ++;
        if (this.minutes == 60) {
            this.minutes = 0;
            this.hours ++;
        }
        if (this.hours >= 24) {
            this.hours %= 24;
        }
		
		
    }

    // Adds delta minutes to the time on this clock.
    public void tock(int delta) {
        this.minutes += delta;
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
        if (this.hours >= 24) {
            this.hours %= 24;
        }
		
		
    }
    
    // Getters Added:
	
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    
}
