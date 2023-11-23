public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;


    public ClockDisplay() {

        this.hours = new NumberDisplay(24);
        this.minutes = new NumberDisplay(60, hours);
        this.seconds = new NumberDisplay(60, minutes);
    }

    public void start() {

        while(true) {
            try {
                Thread.sleep(10);
                this.seconds.increment();
                String time = this.seconds.getTime();
                System.out.println(time);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
