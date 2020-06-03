
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");

        Grade grade = new Grade();

        grade.doSpomething(scanner);
        grade.print();
        grade.printAcceptance();
    }
}
