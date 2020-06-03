import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);
        int question = 1; // number of question asked
        while (question <= maxQuestions){
            int avg = average(lowerLimit, upperLimit);
            if (isGreaterThan(avg)) {
                lowerLimit = avg + 1;
            } else {
                upperLimit = avg;
            }
            question ++;
            if (lowerLimit == upperLimit){
                System.out.println("The number you're thinking of is " + lowerLimit);
                break;
            }
        }
    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public int average(int num1, int num2) {
        return (num1+num2) / 2;
    }

    public boolean isGreaterThan(int value) {
        System.out.print("Is your number greater than " + value + " ? (y/n) ");
        String choice = reader.nextLine();
        if ("y".equals(choice)){
            return true;
        }
        return false;
    }
}