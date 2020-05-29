import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int fac = 1;
        int n = 1;

        while (n <= num){
            fac *= n;
            n++;
        }

        System.out.println("Factorial: " + fac);
    }
}
