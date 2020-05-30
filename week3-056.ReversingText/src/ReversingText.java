
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String word = "";
        int i  = 1;
        while (i <= text.length()){
            char a = text.charAt(text.length() - i);
            word = word + a;
            i++;
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
