
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Grade {

    String grade0 = "", grade1 = "", grade2 = "", grade3 = "", grade4 = "", grade5 = "";

    public void doSpomething(Scanner scanner){

        while (true){
            int score = Integer.parseInt(scanner.nextLine());
            if (score == -1){
                break;
            }
            if (score >= 0 && score <= 29){
                grade0 += "*";
            }else if (score >= 30 && score <= 34){
                grade1 += "*";
            }else if (score >= 35 && score <= 39){
                grade2 += "*";
            }else if (score >= 40 && score <= 44){
                grade3 += "*";
            }else if (score >= 45 && score <= 49){
                grade4 += "*";
            }else if (score >= 50 && score <= 60){
                grade5 += "*";
            }
        }

        //Collections.addAll(scores, grade0, grade1, grade2, grade3, grade4, grade5);
        //scores.addAll(Arrays.asList(score0, score1, score2, score3, score4, score5));
    }

    public void print() {
        System.out.println("Grade Distribution:");
        System.out.println("5: " + grade5);
        System.out.println("4: " + grade4);
        System.out.println("3: " + grade3);
        System.out.println("2: " + grade2);
        System.out.println("1: " + grade1);
        System.out.println("0: " + grade0);
    }

    public int sum() {
        return grade0.length() + grade1.length() + grade2.length() + grade3.length()
                + grade4.length() + grade5.length();
    }

    public void printAcceptance() {
        double percnt = (double) 100 * (grade1.length() + grade2.length() + grade3.length()
                + grade4.length() + grade5.length()) / sum();
        System.out.println("Acceptance percentage: " + percnt);
    }
}
