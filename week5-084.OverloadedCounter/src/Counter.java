public class Counter {
    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check){
        this.number = startingValue;
        this.check = check;
    }

    public Counter(int startingValue){
        this(startingValue, false);
    }

    public Counter(boolean check){
        this(0, true);
    }

    public Counter(){
        this(0, false);
    }

    public int value(){
        return number;
    }

    public void increase(){
        number++;
    }

    public void decrease(){
        if (check){
            if (number > 0){
                number--;
            }
        } else {
            number--;
        }
    }

    public void increase(int increaseAmount){
        if (increaseAmount >= 0){
            number += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount){
        if (decreaseAmount >= 0){
            if (check){
                if ((number - decreaseAmount) >= 0){
                    number -= decreaseAmount;
                } else {
                    number = 0;
                }
            } else {
                number -= decreaseAmount;
            }
        }
    }
}

