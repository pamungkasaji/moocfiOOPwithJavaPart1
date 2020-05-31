public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        value ++;
        if (value > upperLimit) {
            value = 0;
        }
    }

    public String toString() {
        // write code here
        if (value < 10){
            return "0"+value;
        } else {
            return ""+value;
        }
    }

    public int getValue() {
        // write here code that returns the value
        return value;
    }

    public void setValue(int value){
        if (value >= 0 && value <= upperLimit ){
            this.value = value;
        }
    }
}