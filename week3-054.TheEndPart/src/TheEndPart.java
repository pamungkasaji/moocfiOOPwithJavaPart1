
import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word:");
        String word = reader.nextLine();
        int wordLength = word.length();

        System.out.println("Length of the end part:");
        int userLength = Integer.parseInt(reader.nextLine());

        String answer = word.substring(wordLength - userLength);

        System.out.println("Result: " + answer);
    }
}
