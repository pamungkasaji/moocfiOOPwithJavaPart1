
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = reader.nextLine();
        int length = name.length();
        String finalWord = "";
        int i = 1;

        while (i <= length){
            char c = name.charAt(length - i);
            finalWord = finalWord + c;
            i++;
        }

        System.out.println("In reverse order: " + finalWord);
    }
}
