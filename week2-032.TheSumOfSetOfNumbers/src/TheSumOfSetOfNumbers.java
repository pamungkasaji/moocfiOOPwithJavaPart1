
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int n = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int num = 0;

        while ( num <= n ){
            sum += num;
            num++;
            System.out.println(num);
        }

        System.out.println("sum is: " + sum);
    }
}
