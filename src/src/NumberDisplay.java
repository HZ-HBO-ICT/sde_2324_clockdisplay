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

            if(this.hasNextDisplay()) {
                this.next.increment();
            }
        }
    }

    private boolean hasNextDisplay() {
        return this.next != null;
    }
}
