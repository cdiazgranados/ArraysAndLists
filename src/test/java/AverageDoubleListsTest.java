import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {
    AverageDoubleLists obj = new AverageDoubleLists();
    @Test
    void count1() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.5, 3.6, 5.3));
        Double expected = 3.0;

        assertEquals(expected, obj.count(a));
    }


    @Test
    void sum1() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.5, 3.6, 5.3));
        Double expected = 10.4;

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void average1() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.5, 3.6, 5.3));
        Double expected = 3.5;

        assertEquals(expected, obj.average(a));
    }

    @Test
    void average2() {
        ArrayList<Double> a = new ArrayList<Double>();
        Double expected = 0.0;

        assertEquals(expected, obj.average(a));
    }
}