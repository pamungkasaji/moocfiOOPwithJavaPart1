
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        for(int n = 0; n<3; n++){
            System.out.print("Type the number: ");
            read = Integer.parseInt(reader.nextLine());
            sum += read;
        }

        System.out.println("Sum: " + sum);
    }
}
