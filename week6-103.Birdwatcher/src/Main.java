
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);

        BirdWatcher birdWatcher = new BirdWatcher();

        while (true) {
            String input;

            System.out.print("? ");
            input = reader.nextLine();

            if ("Add".equalsIgnoreCase(input)) {
                birdWatcher.add(reader);
            } else if ("Observation".equalsIgnoreCase(input)){
                System.out.print("What was observed:? ");
                input = reader.nextLine();
                birdWatcher.observe(input);
            } else if ("Statistics".equalsIgnoreCase(input)){
                birdWatcher.statistics();
            } else if ("Show".equalsIgnoreCase(input)){
                System.out.print("What? ");
                input = reader.nextLine();
                birdWatcher.print(input);
            } else if ("Quit".equalsIgnoreCase(input)){
                break;
            }
        }
    }
}
