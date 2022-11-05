import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndLists {

    public static void main(String[] args) {
        ArraysAndLists mainObj = new ArraysAndLists(); //Why is it creating an object of itself?

        mainObj.doArrayAnalysis();
        mainObj.doArrayListAnalysis();

        mainObj.doArrayLoading();
    }

    private void doArrayAnalysis() {

        int[] aa = { 2,3,4,5,6};
        int[] bb = { 10, 4, 6, 2, 13, 18, 5};

        AverageIntArrays avga = new AverageIntArrays(); //accesses the AverageIntArrays Class

        int countaa = avga.count(aa);
        int countbb = avga.count(bb);

        int sumaa = avga.sum(aa);
        int sumbb = avga.sum(bb);

        int averageaa = avga.average(aa); //solution will be rounded down
        int averagebb = avga.average(bb);

        System.out.println("AA Count "+countaa+" Sum "+ sumaa+" Avg "+averageaa); //prints what we see in the console.
        System.out.println("BB Count "+countbb+" Sum "+ sumbb+" Avg "+averagebb);   //first two lines
    }

    private void doArrayListAnalysis() {

        ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6)); //gets the list view of these two arrays
        ArrayList<Integer> bb = new ArrayList<Integer>(Arrays.asList(10, 4, 6, 2, 13, 18, 5));

        AverageIntegerLists avga = new AverageIntegerLists(); //access the AverageIntegerLists Class

        int countaa = avga.count(aa); //All these methods need to be changed in the AverageIntegerLists Class
        int countbb = avga.count(bb);

        int sumaa = avga.sum(aa);
        int sumbb = avga.sum(bb);

        int averageaa = avga.average(aa);
        int averagebb = avga.average(bb);

        System.out.println("AA Count "+countaa+" Sum "+ sumaa+" Avg "+averageaa);
        System.out.println("BB Count "+countbb+" Sum "+ sumbb+" Avg "+averagebb);
    }

    private void doArrayLoading() {
        // example of how loadIntArrayFromFile can be used.
        LoadAndStore loader = new LoadAndStore();
        int[] cc = loader.loadIntArrayFromFile("./testIntegerData1.txt"); //info on testIntegerData1 is unclear
        //new souts
        double[] dd = loader.loadDoubleArrayFromFile("./testDoubleData2.txt"); //test

        AverageIntArrays avga = new AverageIntArrays();
        AverageDoubleArrays avda = new AverageDoubleArrays(); //test

        int countcc = avga.count(cc);
        double countdd = avda.count(dd); //test

        int sumcc = avga.sum(cc);
        double sumdd = avda.sum(dd); //test

        int averagecc = avga.average(cc);
        double averagedd = avda.average(dd); //test

        System.out.println("CC Count "+countcc+" Sum "+ sumcc+" Avg "+averagecc);
        System.out.println("DD Count "+countdd+" Sum "+ sumdd+" Avg "+averagedd); //test
    }
}
