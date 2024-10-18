public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;


    public ClockDisplay() {

        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60, hours);
        this.seconds = new NumberDisplay(60, minutes);
    }

    private String getTime() {
        String s = this.seconds.getTime();
        String m = this.minutes.getTime();
        String h = this.hours.getTime();

        return String.format("%s:%s:%s",h, m, s);
    }

    public void start() {

        while(true) {
            try {
                Thread.sleep(10);
                this.seconds.increment();
                String time = this.getTime();
                Console.clearScreen();
                Console.println(time);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
