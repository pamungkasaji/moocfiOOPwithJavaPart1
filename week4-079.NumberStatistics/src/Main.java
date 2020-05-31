import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
//        stats.addNumber(3);
//        stats.addNumber(5);
//        stats.addNumber(1);
//        stats.addNumber(2);
//        System.out.println("Amount: " + stats.amountOfNumbers());
//        System.out.println("sum: " + stats.sum());
//        System.out.println("average: " + stats.average());

        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int num = Integer.parseInt(reader.nextLine());

        while (num != -1){

            if(num % 2 == 0){
                statsEven.addNumber(num);
            } else {
                statsOdd.addNumber(num);
            }
            stats.addNumber(num);

            num = Integer.parseInt(reader.nextLine());
        }

        System.out.println("sum :" + stats.sum());
        System.out.println("sum of even :" + statsEven.sum());
        System.out.println("sum of odd :" + statsOdd.sum());
    }
}
    