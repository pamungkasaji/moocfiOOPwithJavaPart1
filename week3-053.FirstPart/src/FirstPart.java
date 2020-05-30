
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word:");
        String word = reader.nextLine();

        System.out.println("Length of the first part:");
        int n = Integer.parseInt(reader.nextLine());

        String answer = word.substring(0 , n);

        System.out.println("Result: " + answer);
    }
}
