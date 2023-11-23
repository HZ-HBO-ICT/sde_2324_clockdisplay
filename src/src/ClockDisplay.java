public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;

    private NumberDisplay seconds;

    public ClockDisplay() {

        NumberDisplay terminator = new NumberDisplay();


        this.seconds = new NumberDisplay(60, terminator);
        this.minutes = new NumberDisplay(60, seconds);
        this.hours = new NumberDisplay(24, hours);
    }

    public void showTime() {

        System.out.println("clock!");
    }

    public void start() {

        while(true) {
            try {
                Thread.sleep(1000);

                this.seconds.increment();

                this.showTime();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
