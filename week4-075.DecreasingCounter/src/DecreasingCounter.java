public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int initial;

    public DecreasingCounter(int valueAtStart) {
        value = valueAtStart;
        initial = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here the code that decrements the value of counter by one
        if (value > 0){
            value --;
        }
    }

    public void reset(){
        value = 0;
    }

    public void setInitial(){
        value = initial;
    }

    // and here the rest of the methods
}
  