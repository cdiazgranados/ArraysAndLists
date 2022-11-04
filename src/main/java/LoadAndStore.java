import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadAndStore {

    public int[] loadIntArrayFromFile(String filename) { //this returns an array with ints
        ArrayList<Integer> arrList = loadIntegerArrayListFromFile(filename);
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++)
            arr[i] = arrList.get(i); //get() is helpful...
        return arr;
    }

    public ArrayList<Integer> loadIntegerArrayListFromFile(String filename) { //this returns an ArrayList with ints?
        // Creating an object of BufferedReader class
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename)); //this block of code is tested while also testing for errors
        } catch (FileNotFoundException e) { //error thrown if file not found
            e.printStackTrace();
        }
        String line ="";
        ArrayList<Integer> result = new ArrayList<Integer>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break; // break loop at end of file
                if (line.startsWith("//")) continue; // ignore "//" comment lines NEEDS A //
                Integer number = Integer.parseInt(line); //returns an int if it is not an int
                result.add(number); //adds number to the result array list
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    // Build these out: //use the info above to write the following code

    // use testDoubleData2.txt to test

    public double[] loaddoubleArrayFromFile(String filename) { return new double[]{}; } //is this variable name okay with the lowercase?

    public ArrayList<Double> loadDoubleArrayListFromFile(String filename) { return null; }

    // use testStringData3.txt to test

    public String[] loadStringArrayFromFile(String filename) { return null; }

    public ArrayList<String> loadStringArrayListFromFile(String filename) { return null; }

    //
    // Finally: //Should this be done after?
    //
    // Is there some way to re-factor these routines so that
    // loadStringArrayListFromFile() becomes the general case routine //general case routine? Do we use this method in others?
    // and is the only one with IO code in it?
    // All the others become like loadIntArrayFromFile(),
    // where it calls the general case routine?
}

