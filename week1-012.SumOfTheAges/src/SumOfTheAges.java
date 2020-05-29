
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String namea = reader.nextLine();
        
        System.out.print("Type your age: ");
        int agea = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String nameb = reader.nextLine();
        
        System.out.print("Type your age: ");
        int ageb = Integer.parseInt(reader.nextLine());
        
        System.out.println(namea +" and " + nameb + " are " + (agea+ageb) + " in total");
        
        // Implement your program here
    }
}
