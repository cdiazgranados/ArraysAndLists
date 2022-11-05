import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.
    LoadAndStore obj = new LoadAndStore();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        String fileName = "testIntegerData1.txt";
       int[] expected = {4, 5, 6, 11, 13, 8, 9, 7, 14, 18};
        System.out.println(obj.loadIntArrayFromFile(fileName));
        assertArrayEquals(expected, obj.loadIntArrayFromFile(fileName)); //NEEDS assertArrayEquals
    }

    @Test
    void loadIntegerArrayListFromFile() {
        String fileName = "testIntegerData1.txt";
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 11, 13, 8, 9, 7, 14, 18));
        System.out.println(expected);
        System.out.println(obj.loadIntegerArrayListFromFile(fileName));

        assertEquals(expected, obj.loadIntegerArrayListFromFile(fileName));
    }

    @Test
    void loadDoubleArrayFromFile() {
        String fileName = "testDoubleData2.txt";
        double[] expected = {4.4, 5.5, 6.34, 11.0001, 13.004, 8.7, 9.97060, 7.4532, 14.5, 18.00023132123};
        assertArrayEquals(expected, obj.loadDoubleArrayFromFile(fileName)); //NEEDS assertArrayEquals
    }

    @Test
    void loadDoubleArrayListFromFile() {
        String fileName = "testDoubleData2.txt";
        ArrayList<Double> expected = new ArrayList<Double>(Arrays.asList(4.4, 5.5, 6.34, 11.0001, 13.004, 8.7, 9.97060, 7.4532, 14.5, 18.00023132123));

        assertEquals(expected, obj.loadDoubleArrayListFromFile(fileName));
    }

    @Test
    void loadStringArrayFromFile() {
        String fileName = "testStringData3.txt";
        String[] expected = {"4.4", "5.5", "Foo", "11.0001", "Bar", "Lost in Space", "Lido Shuffle", "How much data was destroyed?", "I think therefore I compute", "0", "NaN", "ZipCode Rocks!"};
        assertArrayEquals(expected, obj.loadStringArrayFromFile(fileName)); //NEEDS assertArrayEquals
    }

    @Test
    void loadStringArrayListFromFile() {
        String fileName = "testStringData3.txt";
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("4.4", "5.5", "Foo", "11.0001", "Bar", "Lost in Space", "Lido Shuffle", "How much data was destroyed?", "I think therefore I compute", "0", "NaN", "ZipCode Rocks!"));

        assertEquals(expected, obj.loadStringArrayListFromFile(fileName));
    }
}