
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        /*System.out.println("Top ten by points");
         NHLStatistics.sortByPoints();
         NHLStatistics.top(10);*/
        //Prints top 10 playes based on goals
        System.out.println("Prints top 10 playes based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");

        System.out.println("Print the top 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
        
        System.out.println("Print the statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");
                
        System.out.println("Print the statistics for Philadelphia Flyers (abbreviation: PHI)");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("");
        
        System.out.println("Print the players in Anaheim Ducks");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        System.out.println("");
    }
}
