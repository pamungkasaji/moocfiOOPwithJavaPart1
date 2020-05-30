import fi.helsinki.cs.tmc.edutestutils.Points;
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

@Points("63")
public class SumOfNumbersListTest {
    public ArrayList<Integer> a(int... i ) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int j : i) {
            al.add(j);
        }
        return al;
    }

    @Test
    public void test1() {
        assertEquals("The sum of list[1] is not correct.",
                1, SumOfNumbersList.sum(a(1)));
        assertEquals("The sum of list[2] is not correct.",
                2, SumOfNumbersList.sum(a(2)));
        assertEquals("The sum of list[3] is not correct.",
                3, SumOfNumbersList.sum(a(3)));
    }

    @Test
    public  void test2() {
        assertEquals("The sum of list[1,2,3] is not correct.",
                6, SumOfNumbersList.sum(a(1, 2, 3)));
        assertEquals("The sum of list[2,2,2,2,2,2,2] is not correct.",
                14, SumOfNumbersList.sum(a(2, 2, 2, 2, 2, 2, 2)));
        assertEquals("The sum of list[-1,1,-2,2,-3,3] is not correct.",
                0, SumOfNumbersList.sum(a(-1, 1, -2, 2, -3, 3)));
    }
}
