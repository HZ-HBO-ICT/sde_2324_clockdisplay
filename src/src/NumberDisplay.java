public class NumberDisplay {

    private int max;
    private int current;

    private NumberDisplay next;

    public NumberDisplay(int max, NumberDisplay next) {
        this.max = max;
        this.next = next;
    }

    public NumberDisplay(int max) {
        this.max = max;
    }

    private boolean hasNext() {
        return this.next != null;
    }

    public String getFullTime() {

        String time = this.getTime();

        if(this.hasNext()) {
            return this.next.getFullTime() + ":" + time;
        }

        return time;
    }

    public String getTime() {

        String time = (this.current < 10)
                ? "0" + this.current
                : "" + this.current;

        return time;
    }

    public void increment() {
        this.current++;

        if (this.current == this.max) {
            this.current = 0;

            if(this.hasNext()) {
                this.next.increment();
            }
        }
    }
}
