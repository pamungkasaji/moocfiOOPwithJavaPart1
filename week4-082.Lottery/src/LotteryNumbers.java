import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        int n = 0;
        int num;
        while (n < 7){
            num = random.nextInt(39) + 1;
            if(!containsNumber(num)){
                numbers.add(num);
                n++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        return numbers.contains(number);
    }
}
    