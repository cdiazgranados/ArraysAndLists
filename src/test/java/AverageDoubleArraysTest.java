import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach //what is this?
    void setUp() {
    }

    @AfterEach //what is this?
    void tearDown() {
    }
    AverageDoubleArrays obj = new AverageDoubleArrays();
    @Test
    void count1() {
        double[] a = {1.5, 3.6, 5.3};
        double expected = 3.0;

        assertEquals(expected, obj.count(a));
    }

    @Test
    void count2() {
        double[] a = {3.5, 6.0, 7.3, 2.1, 4.6};
        double expected = 5;

        assertEquals(expected, obj.count(a));
    }


    @Test
    void count3() {
        double[] a = { };
        double expected = 0;

        assertEquals(expected, obj.count(a));
    }

    @Test
    void sum1() {
        double[] a = {1.5, 3.6, 5.3};
        double expected = 10.4;

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void average1() {
        double[] a = {1.5, 3.6, 5.3};
        double expected = 3.5;
        assertEquals(expected, obj.average(a));
    }

    @Test
    void average2() {
        double[] a = {};
        double expected = 0.0;
        assertEquals(expected, obj.average(a));
    }
}