public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

  
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }


    public Time addTime(Time otherTime) {
        Time result = new Time();

        result.seconds = this.seconds + otherTime.seconds;
        result.minutes = this.minutes + otherTime.minutes;
        result.hours = this.hours + otherTime.hours;
        if (result.seconds >= 60) {
            result.seconds -= 60;
            result.minutes++;
        }
        if (result.minutes >= 60) {
            result.minutes -= 60;
            result.hours++;
        }

        return result;
    }

    public static void main(String[] args) {
        Time time1 = new Time(4, 30, 15);
        Time time2 = new Time(2, 45, 30);
        System.out.println("Time 1:");
        time1.displayTime();
        System.out.println("Time 2:");
        time2.displayTime();
        Time sumTime = time1.addTime(time2);
        System.out.println("Sum of Time 1 and Time 2:");
        sumTime.displayTime();
    }
}