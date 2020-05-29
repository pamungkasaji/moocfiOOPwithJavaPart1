
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to number: ");

        int num = Integer.parseInt(reader.nextLine());
        int n =1;

        while (n <= num){
            System.out.println(n);
            n++;
        }
        // Write your code here
        
    }
}
