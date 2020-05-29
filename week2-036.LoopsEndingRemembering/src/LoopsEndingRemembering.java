import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int input = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;

        while (input != -1){
            sum += input;
            count++;
            avg = (double)sum/count;

            if(input % 2 == 0){
                even++;
            } else {
                odd++;
            }

            System.out.println("Type numbers: ");
            input = Integer.parseInt(reader.nextLine());
        }

        System.out.println("");
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average " + avg);
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);

    }
}
