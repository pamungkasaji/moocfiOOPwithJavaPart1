
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Lower: ");
        int lower = Integer.parseInt(reader.nextLine());
        System.out.print("Upper: ");
        int upper = Integer.parseInt(reader.nextLine());

        int sum = 0;

        while (lower <= upper){
            sum += lower;
            lower++;
        }

        System.out.println("The sum " + sum);
    }
}
