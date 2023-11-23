public class NumberDisplay {

    private int max;
    private int current;

    private boolean terminator;

    private NumberDisplay _next;

    public NumberDisplay() {
        this.terminator = true;
    }

    public NumberDisplay(int max, NumberDisplay next) {
        this.max = max;
        this.current = 0;
        this._next = next;
    }

    private boolean overflows() {
        return this.current == this.max;
    }

    public void increment() {
        this.current ++;

        if(this.overflows()) {
            this._next.increment();
        }
    }

    public String getDisplayValue() {

        if (this.terminator) {
            return "";
        }

        String num = (current < 10)
                ? ": 0" + current
                : ": " + current;

        String full = num + this._next.getDisplayValue();

        return full;
    }
}
