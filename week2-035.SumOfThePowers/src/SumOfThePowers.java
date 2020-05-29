
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type number: ");
        int num = Integer.parseInt(reader.nextLine()); //user input
        int sum = 0; // end result
        int n = 0; // starting power

        while (n <= num){
            sum += (int)Math.pow(2,n);
            n++;
        }

        System.out.println("The sum :" + sum);
    }
}
