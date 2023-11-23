import java.io.IOException;

public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;


    public ClockDisplay() {

        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60, hours);
        this.seconds = new NumberDisplay(60, minutes);
    }

    public String getTime() {

        String time = this.seconds.getFullTime();

        return time;
    }

    public void Display(String msg) {
        
        System.out.println(msg);
    }

    public void start() {

        while(true) {
            try {
                Thread.sleep(100);
                this.seconds.increment();

                this.Display(getTime());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
