public class NumberDisplay {

    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    public void increment() {
        value = (value + 1) % limit;
    }
    public String getDisplayValue()
        {
            if(value < 10) {
                return "0" + value;
            }
            else {
                return "" + value;
            }
        }
    );
}
