public class AverageDoubleArrays {


// Complete these methods

    public double count(double[] aa) { //SHOULD THESE BE DOUBLES OR INTS??????????????????????
        double count = aa.length;       //I changed these from ints to doubles
        return count;                   //does dividing a double by an int result in a double? yes
    }

    public double sum(double[] aa) {
        double sum = 0;

        for (int i = 0; i < aa.length; i++) {
            sum += aa[i];
        }
        return sum;
    }

    public double average(double[] aa) {
        return sum(aa) / count(aa);
    }

}
