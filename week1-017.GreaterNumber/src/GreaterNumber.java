import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int a = Integer.parseInt(reader.nextLine());

        if(a <= 30){
            System.out.println("Grade: failed");
        }else if(a <= 34){
            System.out.println("Grade: 1");
        }else if(a <= 39){
            System.out.println("Grade: 2");
        }else if(a <= 44){
            System.out.println("Grade: 3");
        }else if(a <= 49){
            System.out.println("Grade: 4");
        }else if(a <= 60){
            System.out.println("Grade: 5");
        }
    }
}
