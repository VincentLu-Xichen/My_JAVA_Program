/*
 * Exercise Week #8
 */
public class AlarmClock extends Clock {
    
    // Alarm's hours, minutes, sound
    private int alarmHours;
    private int alarmMinutes;
    String alarmSound;
    
    
    // Exercise #8.1
    // Creates an Alarm clock whose initial time is h hours and m minutes,
    //     sounds an alarm at alarmHours hours and alarmMinutes minutes,
    //     with the default sound "Beep beep beep beep!"
    public AlarmClock(int h, int m, int alarmHours, int alarmMinutes) {
		super(h,m);
        this.alarmHours = alarmHours;
        this.alarmMinutes = alarmMinutes;
        this.alarmSound = "Beep beep beep beep!";
    }
    
    
    // Exercise #8.2
    // Creates an Alarm clock whose initial time is h hours and m minutes,
    //     sounds an alarm at alarmHours hours and alarmMinutes minutes,
    //     and sets the sound to alarmSound
    public AlarmClock(int h, int m, int alarmHours, int alarmMinutes, String alarmSound) {
		super(h,m);
        this.alarmHours = alarmHours;
        this.alarmMinutes = alarmMinutes;
        this.alarmSound = alarmSound;
    }
    
    
    // Exercise #8.3
    // Adds 1 minute to the time on this Alarm clock.
    // In addition, it sounds (prints) the alarm at the specified time.
    @Override
    public void tick() {
        // 先推进当前时钟时间 1 分钟（父类逻辑负责分钟进位与小时取模）
        super.tick();
        // 当当前时间与闹钟时间一致时，响铃
        if (this.alarmHours == this.getHours() && this.alarmMinutes == this.getMinutes()) {
            System.out.println(this.alarmSound);
        }


		
    }
    
    
    // Test Client
    public static void main(String[] args) {
        AlarmClock ac1 = new AlarmClock(5, 58, 6, 0);
        ac1.tick();
        ac1.tick();  // Beep beep beep beep!
        System.out.println(ac1);  // 06:00
        
        AlarmClock ac2 = new AlarmClock(14, 29, 14, 30, "Wake Up! The Hero! Kamen Rider!");
        ac2.tick();  // Wake Up! The Hero! Kamen Rider!
    }
    
}
