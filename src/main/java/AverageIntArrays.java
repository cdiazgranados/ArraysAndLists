public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int sum = 0;

        for (int i = 0; i < aa.length; i++) {
            sum += aa[i];
        }
        return sum;
    }

    public int average(int[] aa) {
        return sum(aa) / count(aa);
    }

}
